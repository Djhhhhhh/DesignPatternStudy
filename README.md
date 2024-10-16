# 设计模式

​	一套被反复使用、多数人知晓的、经过分类编目的、代码设计经验的总结。使用设计模式是为了可重用代码、让代码更容易被他人理解、保证代码可靠性、程序的重用性。

## 设计模式基本概念

### 设计模式的六大原则

#### 开闭原则（Open Close Principle）

​	对扩展开放，对修改关闭。

​	对于一个项目，在新增功能模块的时候，只在相应的服务中添加相应的功能，不对固有功能进行修改，保证了代码扩展性，易于维护和升级。

#### 里氏代换原则（Liskov Substitution Principle）

​	任何引用基类的地方必须可以透明的使用其子类。

​	简单来说，对于一个函数，如果它可以接受一个父类对象，那么他页必须可以接受其子类对象。

#### 依赖倒转原则（Dependence Inversion Principle）

​	针对接口编程，不针对实现编程。

#### 接口隔离原则（Interface Segregation Principle）

​	使用多个专一的接口要比使用一个统一的接口要好。

​	本质上来说，就是要降低程序的耦合度。

#### 迪米特法则（Demeter Principle）

​	又称最少知道原则。

​	每一个软件单位对其他的单位都只有最少的知识，而且局限于那些与本单位密切相关的软件单位。

​	一个软件实体以应当尽可能少的与其他实体发生相互作用。

#### 合成复用原则（Composite Reuse Principle）

​	在不同环境中尽量使用已有的设计和实现方法。

### 设计模式分类

#### 创建型设计模式

​	对类实例化过程进行了抽象，能够对软件模块中对象的创建和对象的使用进行分离。

#### 结果型设计模式

#### 行为型设计模式



## 23+1种设计模式

### 简单工厂模式

​	简单工厂模式不属于23种GOF设计模式之一，但是非常常用所以一般将其归纳成一种设计模式。

​	简单工厂模式属于创建型设计模式。

​	在简单工厂模式简单来说，就是定义一个类，根据传入的参数不同，返回不同类的实例。

​	当我们的需求比较简单的时候可以使用该方法生成对象，否则我们应该使用下面介绍的工厂方法模式。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/SimpleFactoryPattern

![image-20241014195308942](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241014195308942.png)

##### 流程解读

![image-20241014200305418](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241014200305418.png)

##### 核心代码

~~~java
public class CodeSandboxFactory {
    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
        }
        return new ThirdPartyCodeSandbox();
    }
}

~~~

##### 调用

~~~java
CodeSandbox codeSandbox = CodeSandboxFactory.newInstance(type);
~~~

##### 测试

![image-20241015183926080](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241015183926080.png)

### 工厂方法模式

​	又称工厂模式、虚拟构造器模式、多态工厂模式，属于类创建型模式。

​	工厂父类负责定义创建产品对象的公共接口，工厂子类负责生成具体的产品对象，目的是将产品类的实例化操作延迟到工厂子类中完成，即通过子类确定究竟实例化那个产品类。

​	该方法应该应用在后续需求不确定的时候，有可能会加上大量的产品，可以不用修改代码，添加新的工厂从而添加新的产品。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/FactoryMethodPattern

![image-20241015184005851](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241015184005851.png)

##### 流程解读

![image-20241015184546580](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241015184546580.png)

##### 核心代码

~~~java
public abstract class CodeSandboxFactory {
    public abstract CodeSandbox newInstance();
}
public class RemoteCodeSandboxFactory extends CodeSandboxFactory{
    @Override
    public CodeSandbox newInstance() {
        return new RemoteCodeSandbox();
    }
}
public class ThirdCodeSandboxFactory extends CodeSandboxFactory{
    @Override
    public CodeSandbox newInstance() {
        return new ThirdCodeSandbox();
    }
}
~~~

##### 调用

~~~java
CodeSandboxFactory codeSandboxFactory1=new RemoteCodeSandboxFactory();
CodeSandboxFactory codeSandboxFactory2=new ThirdCodeSandboxFactory();
CodeSandbox codeSandbox1=codeSandboxFactory1.newInstance();
CodeSandbox codeSandbox2=codeSandboxFactory2.newInstance();
return codeSandbox1.executeCode() + " "+codeSandbox2.executeCode();
~~~

##### 测试

![image-20241015183816503](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241015183816503.png)

### 抽象工厂模式

​	投诚Kit模式，属于创建型设计模式。

​	提供一个创建一些列相关或相互依赖的对象的接口，而无须指定他们具体的类。

​	通过创建抽象工厂，通过抽象工厂创建不同的具体工厂。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/AbstractFactoryPatter

![image-20241015193307245](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241015193307245.png)

##### 流程解读

![image-20241015193637778](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241015193637778.png)

##### 核心代码

~~~~java
public interface AbstractCodeSandboxFactory {
    public CodeSandbox createSandbox();
}
public class RemoteCodeSandboxFactory implements AbstractCodeSandboxFactory {
    @Override
    public CodeSandbox createSandbox() {
        return new RemoteCodeSandbox();
    }
}
public class ThirdCodeSandboxFactory implements AbstractCodeSandboxFactory {
    @Override
    public CodeSandbox createSandbox() {
        return new ThirdCodeSandbox();
    }
}
~~~~

##### 调用

~~~java
abstractCodeSandboxFactory1=new RemoteCodeSandboxFactory();
abstractCodeSandboxFactory2=new ThirdCodeSandboxFactory();
CodeSandbox codeSandbox1=abstractCodeSandboxFactory1.createSandbox();
CodeSandbox codeSandbox2=abstractCodeSandboxFactory2.createSandbox();
return codeSandbox1.executeCode()+" "+codeSandbox2.executeCode();
~~~

##### 测试

![image-20241015193130051](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241015193130051.png)

### 单例模式

​	又称单件模式或单态模式，属于创建型模式。

​	通过让一个类自身保存它的唯一实例，这个类可以确保没有被其他实例被创建，并且它可以提供一个访问该实例的方法。

​	一般用于创建一个全局需要的对象，且这个对象只有一个。

​	单例模式分为：1.饿汉式，2.懒汉式

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/SingletonPatter

![image-20241016183323847](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241016190326968.png)

##### 流程解读

![image-20241016184158955](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241016184158955.png)

##### 核心代码

饿汉式单例模式

~~~java
@Getter
public class HungryConfig {
    private String time;
    private String name;
    private static HungrySingletConfig hungrySingleConfig =null;
    private  HungrySingletConfig(){
        initConfig();
        System.out.println("产生实例");
    }
    public static HungrySingletConfig getInstance(){
        if(hungrySingleConfig==null){
            hungrySingleConfig = new HungrySingletConfig();
        }
        return hungrySingleConfig;
    }
    private void initConfig(){
        this.name="Djhhh";
        this.time="Time is now";
    }
}
~~~

懒汉式单例模式

```java
@Getter
public class LazyConfig {
    private String time;
    private String name;
    private static final LazySingletonConfig lazySingletonConfig = new LazySingletonConfig();
    private LazySingletonConfig(){
        initConfig();
        System.out.println("产生实例");
    }
    public static LazySingletonConfig getInstance(){
        return lazySingletonConfig;
    }
    private void initConfig(){
        this.name="Djhhh";
        this.time="Time is now";
    }
}
```

##### 调用

~~~java
String result="";
result+="准备创建懒汉式实例\n";
LazySingletonConfig lazySingletonConfig=LazySingletonConfig.getInstance();
result+=lazySingletonConfig.getName()+"\n";
result+=lazySingletonConfig.getTime()+"\n";
result+="准备创建饿汉式实例\n";
HungrySingletConfig hungrySingletConfig=HungrySingletConfig.getInstance();
result+=hungrySingletConfig.getName()+"\n";
result+=hungrySingletConfig.getTime()+"\n";
~~~

##### 测试

![image-20241016183213318](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241016183213318.png)

### 原型模式

​	创建型模式。

​	通过复制现有的实例来创建新的实例，无需知道相应类的信息。

​	在项目中，部分对象的创建可能比较复杂，并且有时可能需要频繁的创建同一个类似的实体，这时我们采用原型模式。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/PrototypePatter

![image-20241016194845868](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241016194845868.png)

##### 流程解读

![image-20241016195228920](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241016195228920.png)

##### 核心代码

```java
@Getter
@Setter
public class Tank implements Cloneable {
    private String bullet;
    private Tank tank;
    public Tank(){
        this.bullet="子弹未配置";
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Tank tank= (Tank) super.clone();
        if (this.tank != null) {
            tank.tank = (Tank) this.tank.clone();
        }
        return tank;
    }
}
```

##### 调用

~~~java
@Service
public class TankServiceImpl implements TankService {
    @Override
    public String tankList() throws CloneNotSupportedException {
        StringBuilder result = new StringBuilder();
        Tank tank = new Tank();
        tank.setTank(new Tank()); // 初始化 tank 属性
        result.append("创建tank原型").append(tank).append(",子弹类型为:").append(tank.getBullet());
        tank.setBullet("bb");
        for (int i = 1; i <= 10; i++) {
            result.append("创建tank原型").append(i).append("号");
            Tank tank1 = (Tank) tank.clone();
            result.append(tank1);
            tank1.setBullet(tank1.getBullet() + i);
            result.append("子弹类型:").append(tank1.getBullet());
        }
        return result.toString();
    }
}
~~~

##### 测试

![image-20241016194938249](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241016194938249.png)
