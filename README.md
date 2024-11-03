[TOC]

# 前导

github地址：[Djhhhhhh/DesignPatternStudy](https://github.com/Djhhhhhh/DesignPatternStudy)

内涵代码示例源代码和文件原代码。

所有内容参考自：软件体系结构与设计使用教程(第二版)，[设计模式 | 菜鸟教程](https://www.runoob.com/design-pattern/design-pattern-tutorial.html)

因也是第一次具体学习设计模式，对于部分设计模式理解并不深刻，故可能存在大量错误与疏漏，欢迎补充。

计划：因时序图只展示了调用的过程，对于部分设计模式并不能很好的展示，后续可能会补充UML类图来展示类与类之间的关系；额外开辟文章解释设计模式优缺点，组合关系，比较部分设计模式的相似处，设计模式相关面试题。

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

| 名称                                   | 通俗解释                                       |
| -------------------------------------- | ---------------------------------------------- |
| 简单工厂模式（SimpleFactoryPattern）   | 根据参数不同生成不同实例返回                   |
| 工厂方法模式（FactoryMethodPattern）   | 根据后续需求不同通过添加新的工厂来添加新的产品 |
| 抽象工厂模式（AbstractFactoryPattern） | 通过抽象工厂创建具体工厂创建产品               |
| 单例模式（SingletonPattern）           | 系统中存在单实例对象时使用                     |
| 原型模式（PrototypePattern）           | 存在复杂对象的时候，提供clone方法              |
| 建造者模式（BuildePattern）            | 创建复杂对象，零件种类不变，组装方式经常改变   |

#### 结构型设计模式

| 名称                            | 通俗解释                                   |
| ------------------------------- | ------------------------------------------ |
| 外观模式（FacadePattern）       | 为接口创建一个统一的接口来调用             |
| 适配器模式（AdapterPattern）    | 将一个类为新环境变化转变创建适配器         |
| 桥接模式（BridgePattern）       | 将对象抽象部分与实体分离，改变不会互相影响 |
| 组合模式（CompositePattern）    | 将一些对象组合到一起，一个改变多个改变     |
| 装饰器模式（DecoratorPatetern） | 将对象的部分行为属性分离，创建装饰器       |
| 代理模式（ProxyPattern）        | 因安全性等问题，将对象的操作交给代理类     |
| 享元模式（FlyweightPattern）    | 创建大量重复对象，通过hash来防止重复创建   |

#### 行为型设计模式

| 名称                                       | 通俗解释                                                |
| ------------------------------------------ | ------------------------------------------------------- |
| 模板模式（TemplatePattern）                | 定义行为逻辑，将实现推到子类                            |
| 策略模式（StrategyPattern）                | 将可能使用到的算法封装，通过不同的策略可以相互替换      |
| 状态模式（StatePattern）                   | 当状态发生改变的时候行为也会发生变化                    |
| 责任链模式（ChainOfResponsibilityPattern） | 对于一组链式操作，建立责任链，解耦接收者和请求者        |
| 命令模式（CommandPattern）                 | 将请求参数化，解耦接收者和请求者                        |
| 观察者模式（ObserverPattern）              | 当一堆对象中一个发生变化，其余对象跟着一起变化          |
| 中介者模式（MediatorPattern）              | 用中介对象封装调用                                      |
| 迭代器模式（IteratorPattern）              | 字面意思，迭代器                                        |
| 访问者模式（VisitorPattern）               | 通过添加visitor类，使得不改变元素的前提下定义新行为模式 |
| 备忘录模式（MementoPattern）               | 将对象之前的状态保存在备忘录中，需要的时候可以回溯      |
| 解释器模式（InterpreterPattern）           | 解释语言的文法                                          |

## 23+1种设计模式

### 简单工厂模式（SimpleFactoryPattern）

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

### 工厂方法模式（FactoryMethodPattern）

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

### 抽象工厂模式（AbstractFactoryPattern）

​	属于创建型设计模式。

​	提供一个创建一些列相关或相互依赖的对象的接口，而无须指定他们具体的类。

​	通过创建抽象工厂，通过抽象工厂创建不同的具体工厂。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/AbstractFactoryPattern

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

### 单例模式（SingletonPattern）

​	又称单件模式或单态模式，属于创建型模式。

​	通过让一个类自身保存它的唯一实例，这个类可以确保没有被其他实例被创建，并且它可以提供一个访问该实例的方法。

​	一般用于创建一个全局需要的对象，且这个对象只有一个。

​	单例模式分为：1.饿汉式，2.懒汉式

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/SingletonPattern

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

### 原型模式（PrototypePattern）

​	创建型模式。

​	通过复制现有的实例来创建新的实例，无需知道相应类的信息。

​	在项目中，部分对象的创建可能比较复杂，并且有时可能需要频繁的创建同一个类似的实体，这时我们采用原型模式。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/PrototypePattern

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

### 建造者模式（BuildePattern）

​	创建型设计模式。

​	将一个复杂对象的构建与他的表示分离，使得同样的构建过程可以创建不同的表示。

​	建造者模式包含以下角色：

-   产品Product：要构建的复杂对象。
-   抽象建造者Builder：定义了构建产品的抽象接口。
-   具体建造者ConcreteBuilder：实现抽象建造接口，具体确定如何构建产品的各个部分，并负责返回最终构建的产品。
-   指导者Director：负责调用建造者的方法来构建产品。

​	当在系统中，存在一个复杂对象需要重复创建，并且在每次创建的时候基本组件的种类基本不变，但是组合需要灵活变化，那么我们可以使用建筑者模式进行设计。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/BuildePattern

![image-20241027163039015](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241027163039015.png)

##### 流程解读

![image-20241027162925542](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241027162925542.png)

##### 核心代码

```java
public interface Builder {
    void buildWord1();
    void buildWord2();
}
public class ConcreteBuilder1 implements Builder{ //此处只展示ConcreteBuilder1
    private Product product=new Product();
    @Override
    public void buildWord1() { this.product.setWord1("word1"); }
    @Override
    public void buildWord2() { this.product.setWord2("word2"); }
    public Product getProduct() {  return product; }
}
public class Director {
    private Builder builder;
    public Director(Builder builder){  this.builder=builder;  }
    public void setBuilder(Builder builder) { this.builder = builder;}
    public void construct(){
        builder.buildWord1();
        builder.buildWord2();
    }
}
@Data
public class Product {
    private String word1;
    private String word2;
}
```

##### 调用

~~~java
@Service
public class WordServiceImpl implements WordService {
    @Override
    public String word() {
        String result="";
        ConcreteBuilder1 builder1=new ConcreteBuilder1();
        ConcreteBuilder2 builder2=new ConcreteBuilder2();
        Director director=new Director(builder1);
        director.construct();
        result+=builder1.getProduct().toString();
        director.setBuilder(builder2);
        director.construct();
        result+='\n'+builder2.getProduct().toString();
        return result;
    }
}
~~~

##### 测试

![image-20241027161956767](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241027161956767.png)

### 外观模式（FacadePattern）

​	属于结构型设计模式。

​	外部与一个子系统的通信必须通过一个统一的外观对象进行，为子系统中的一组接口提供一个一致的接口，外观模式定义了一个高层接口，这个接口使得子系统更加容易使用。

​	降低系统的复杂度，让子系统通过一个统一的外观对象进行调用。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/FacadePattern

![image-20241027192054581](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241027192054581.png)

##### 流程解读

![image-20241027173250780](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241027173250780.png)

##### 核心代码

~~~java
public class Facade {
    private static Facade facade=new Facade();
    private C1 c1;
    private C2 c2;
    private C3 c3;
    private Facade(){
        c1=new C1();
        c2=new C2();
        c3=new C3();
    }
    public static Facade getInstance(){
        return facade;
    }
    public String doA(){
        return this.c1.go();
    }
    public String doB(){
        return this.c1.go()+" "+this.c2.go()+" "+this.c3.go();
    }
}
~~~

##### 调用

~~~java
@Service
public class CSserviceImpl implements CService {
    @Override
    public String doC() {
        Facade facade=Facade.getInstance();
        return facade.doA()+" "+facade.doB();
    }
}
~~~

##### 测试

![image-20241027172825310](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241027172825310.png)

### 适配器模式（AdapterPattern）

​	属于结构型设计模式。

​	将一个类的接口转换为另一个接口，使得原本不兼容的类可以协同工作。

​	本质上来说，就是对于一个旧的对象，我们想要这个对象保留之前的部分属性，还要适配现在新的环境。我们可以通过适配器模式，通过继承之前的对象，然后添加新的属性来进行适配。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/AdapterPattern

![image-20241027192035592](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241027192035592.png)

##### 流程解读

![image-20241027192004356](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241027192004356.png)

##### 核心代码

~~~java
public interface Electricity {
    public String recharge(String type);
}
public class NewWiring implements Recharge{
    @Override
    public String recharge220() {
        return "充220";
    }
    @Override
    public String recharge110() {
        return "不充";
    }
}
public class OldWiring implements Recharge{
    @Override
    public String recharge220() {
        return "不充";
    }
    @Override
    public String recharge110() {
        return "充110";
    }
}
public interface Recharge {
    public String recharge220();
    public String recharge110();
}
public class ElectricityAdapter implements Electricity{
    Recharge recharge;
    public ElectricityAdapter(String type){
        if("220".equals(type)){
            recharge = new NewWiring();
        }else{
            recharge = new OldWiring();
        }
    }
    @Override
    public String recharge(String type) {
        if(type.equals("220")){
           return recharge.recharge220();
        }else{
           return recharge.recharge110();
        }
    }
}
public class Wiring implements Electricity{
    ElectricityAdapter electricityAdapter;
    @Override
    public String recharge(String type){
        electricityAdapter=new ElectricityAdapter(type);
        return electricityAdapter.recharge(type);
    }
}
~~~

##### 调用

~~~java
@Service
public class WiringServiceImpl implements WiringService {
    @Override
    public String doRecharge() {
        Wiring wiring=new Wiring();
        String s = wiring.recharge("220");
        s +=" " + wiring.recharge("110");
        return s;
    }
}
~~~

##### 测试

![image-20241027190905517](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241027190905517.png)

### 桥接模式（BridgePattern）

​	属于结构型设计模式。

​	将抽象部分与它的实现部分分离，使它们都可以独立的变化。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/BridgePattern

![image-20241027195531789](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241027195531789.png)

##### 流程解读

![image-20241027195926276](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241027195926276.png)

##### 核心代码

~~~java
public class GreenCirlce implements MadeCircle {
    @Override
    public String makeCircle(int radius, int x, int y) {
        return "半径:"+radius+";颜色:Green;x:"+x+";y:"+y+";";
    }
}
public class RedCircle implements MadeCircle{
    @Override
    public String makeCircle(int radius, int x, int y) {
        return "半径:"+radius+";颜色:Red;x:"+x+";y:"+y+";";
    }
}
public interface MadeCircle {
    public String makeCircle(int radius, int x, int y);
}
public abstract class Shape {
    protected MadeCircle madeCircle;
    protected Shape(MadeCircle madeCircle){
        this.madeCircle=madeCircle;
    }
    public abstract String made();
}
public class Circle extends Shape{
    private int x,y,radius;
    public Circle(int x,int y,int radius,MadeCircle madeCircle){
        super(madeCircle);
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    @Override
    public String made() {
        return madeCircle.makeCircle(radius,x,y);
    }
}
~~~

##### 调用

~~~java
@Service
public class CircleServiceImpl implements CircleService {
    @Override
    public String makeCircle() {
        Shape redCircle=new Circle(1,1,1,new RedCircle());
        Shape greenCircle=new Circle(1,1,1,new GreenCirlce());
        return redCircle.made()+greenCircle.made();
    }
}
~~~

##### 测试

![image-20241027195427923](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241027195427923.png)

### 组合模式（CompositePattern）

​	属于结构型设计模式。

​	组合多个对象形成树形结构以表示“整体-部分”的层次结构。

​	组合模式对单个对象和组合对象的使用具有一致性。

​	当我们的项目中存在树形结构关系，例如组织管理等关系，每一层都可以管理下面的人，那么我们可以使用组合模式来管理这些人的关系。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/BridgePattern

![image-20241028140912181](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241028140912181.png)

##### 流程解读

![image-20241028141623372](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241028141623372.png)

##### 核心代码

~~~java
@Data
public class Person {
    private String name;
    private String id;
    private String job;
    private ArrayList<Person> people;
    public Person(String id,String name,String job){
        this.job=job;
        this.id=id;
        this.name=name;
        this.people=new ArrayList<Person>();
    }
    public void add(Person person){
        this.people.add(person);
    }
    public void remove(Person person){
        this.people.remove(person);
    }
}
~~~

##### 调用

~~~java
@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public String doPeroson() {
        Person ceo=new Person("1","ceo","ceo");
        Person manager=new Person("4","manager","manager");
        Person clerk1=new Person("2","clerk1","clerk");
        Person clerk2=new Person("3","clerk2","clerk");
        ceo.add(manager);
        manager.add(clerk1);
        manager.add(clerk2);
        StringBuilder s= new StringBuilder();
        for(Person x:ceo.getPeople()){
            for(Person y:x.getPeople()){
                s.append(y.getId()).append(" ").append(y.getName()).append(" ").append(y.getJob());
            }
        }
        return s.toString();
    }
}
~~~

##### 测试

![image-20241028140732149](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241028140732149.png)

### 装饰器模式（DecoratorPatetern）

​	属于结构型设计模式。	

​	动态地给一个对象添加一个额外的职责。

​	通过将对象和对对象的修饰相分离，方便为对象添加一些属性和行为。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/DecoratorPattern

![image-20241030164842434](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241030164842434.png)

##### 流程解读

![image-20241030165332562](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241030165332562.png)

##### 核心代码

~~~java
public interface Shape {
    String draw();
}
public class ShapeDecorator implements Shape{
    protected Shape decorated;

    public ShapeDecorator(Shape decorated){
        this.decorated = decorated;
    }

    @Override
    public String draw() {
        return decorated.draw();
    }
}
public class Circle implements Shape {
    @Override
    public String draw() {
        return "圆型";
    }
}
public class RedCircleDecorator extends ShapeDecorator{
    public RedCircleDecorator(Shape shape){
        super(shape);
    }
    @Override
    public String draw(){
        return decorated.draw()+"+红色";
    }
}
~~~

##### 调用

~~~java
@Service
public class ShapeServiceImpl implements ShapeService {
    @Override
    public String draw() {
        Circle circle=new Circle();
        RedCircleDecorator redCircleDecorator=new RedCircleDecorator(new Circle());
        return circle.draw()+"     "+redCircleDecorator.draw();
    }
}
~~~

##### 测试

![image-20241030164949059](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241030164949059.png)

### 代理模式（ProxyPattern）

​	属于结构型设计模式。

​	给某一个对象提供一个代理，并由代理对象控制对原对象的引用。

​	理解为，某对象因安全性等等问题，只能简介调用，那么我们可以使用代理模式，为他创建一个代理类，通过代理类来调用对象。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/ProxyPattern

![](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241030174515720.png)

##### 流程解读

![image-20241030174851157](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241030174851157.png)

##### 核心代码

~~~java
public interface Client {
    public String getAns();
}
public class RemoteClient implements Client{
    @Override
    public String getAns() {
        return "远程客户端";
    }
}
public class ClientProxy implements Client{
    RemoteClient client;
    @Override
    public String getAns() {
        if(client==null){
            client= new RemoteClient();
        }
        return client.getAns();
    }
}
~~~

##### 调用

~~~java
@Service
public class RemoteServiceImpl implements RemoteService {
    @Override
    public String go() {
        ClientProxy proxy=new ClientProxy();
        return proxy.getAns();
    }
}
~~~

##### 测试

![image-20241030174421383](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241030174421383.png)

### 享元模式（FlyweightPattern）

​	属于结构型设计模式。

​	运用共享技术有效地支持大量细粒度对象的复用。

​	通俗来讲：对于项目中部分可能会重复用到的相似对象，我们可以写一个hash值，防止重复创建类似对象。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/ProxyPattern

![image-20241030183145214](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241030183145214.png)

##### 流程解读

![image-20241030183130310](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241030183130310.png)

##### 核心代码

~~~java
public interface Shape {
    String get();
}
@Data
public class Point implements Shape{
    private int x;
    private int y;
    private String color;
    public Point(String col){
        this.color=col;
    }
    @Override
    public String get() {
        return this.x+this.y+this.color;
    }
}
public class PointFlyweightFactory {
    private static final HashMap<String,Point>p=new HashMap<>();
    public static Point getPoint(String color){
        Point point=p.get(color);
        if(point==null){
            point=new Point(color);
            p.put(color,point);
        }
        return point;
    }
}
~~~

##### 调用

~~~java
@Service
public class PointServiceImpl implements PointService {
    @Override
    public String go() {
        String ans="";
        Point point1 = PointFlyweightFactory.getPoint("red");
        point1.setX(1);
        point1.setY(1);
        ans+= point1.get();
        Point point2 = PointFlyweightFactory.getPoint("red");
        point2.setX(1);
        point2.setY(2);
        ans+= " " +  point2.get();
        return ans;
    }
}
~~~

##### 测试

![image-20241030182718345](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241030182718345.png)

### 模板模式（TemplatePattern）

​	属于行为型设计模式。

​	定义一套逻辑框架，将他的实现推到子类。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/TemplatePattern

![](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241030190512243.png)

##### 流程解读

![image-20241030190820354](C:\Users\ASUS\AppData\Roaming\Typora\typora-user-images\image-20241030190820354.png)

##### 核心代码

~~~java
public interface DoOut {
    public String doA();
    public String doB();
    public String doC();
}
public class DoOutP implements DoOut{
    @Override
    public String doA() {
        return "A";
    }
    @Override
    public String doB() {
        return "B";
    }
    @Override
    public String doC() {
        return "C";
    }
    public String dododo(){
        return this.doA()+" "+this.doB()+" "+this.doC();
    }
}
~~~

##### 调用

~~~java
@Service
public class DoServiceImpl implements DoService{
    @Override
    public String go() {
        return new DoOutP().dododo();
    }
}
~~~

##### 测试

![image-20241030190417239](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241030190417239.png)

### 策略模式（StrategyPattern）

​	行为型设计模式。

​	定义一系列可能会用到的算法，封装起来，并让他们可以相互替换。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/StrategyPattern

![image-20241030192819092](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241030192819092.png)

##### 流程解读

![image-20241030193253346](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241030193253346.png)

##### 核心代码

~~~java
public class DoAlgorithm {
    public String algorithm(int a){
        if(a<=1000){
            return "纯暴力";
        }else{
            return "其他算法";
        }
    }
}	
~~~

##### 调用

~~~java
@Service
public class ProServiceImpl implements ProService{
    @Override
    public String go() {
        String s="";
        s+= " 100:"+new DoAlgorithm().algorithm(100);
        s+= " 1000:"+new DoAlgorithm().algorithm(1000);
        s+= " 10000:"+new DoAlgorithm().algorithm(10000);
        s+= " 100000:"+new DoAlgorithm().algorithm(100000);
        return s;
    }
}
~~~

##### 测试

![image-20241030192958791](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241030192958791.png)

### 状态模式（StatePattern）

​	属于行为型设计模式。

​	允许一个对象在其内部状态改变时改变它的行为，对象看起来似乎修改了它的类。

​	当我们在设计的过程中，某个对象存在大量状态，当状态转换之后，行为也会发生转变。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/StrategyPattern

![image-20241101192538661](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241101192538661.png)

##### 流程解读

![image-20241101192831276](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241101192831276.png)

##### 核心代码

~~~java
public interface State {
    String message(Context context);
}
public class StopState implements State {
    @Override
    public String message(Context context) {
        context.setState(new RunState());
        return "Run message";
    }
}
public class RunState implements State{
    @Override
    public String message(Context context) {
        context.setState(new StopState());
        return "Stop message";
    }
}
@Data
public class Context {
    private State state;
    public String request(){
        return state.message(this);
    }
}
~~~

##### 调用

```java
@Service
public class ContextServiceImpl implements ContextService {
    @Override
    public String go() {
        String result="";
        Context context=new Context();
        context.setState(new RunState());
        result += "/"+context.request();
        result += "/"+context.request();
        result += "/"+context.request();
        result += "/"+context.request();
        return result;
    }
}
```

##### 测试

![image-20241101192437067](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241101192437067.png)

### 责任链模式（ChainOfResponsibilityPattern）

​	属于行为型设计模式。

​	对于一整个链型操作组，建立责任链，避免接收者和请求者耦合。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/ChainOfResponsibilityPattern

![image-20241101195941952](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241101195941952.png)

##### 流程解读

![image-20241101200210599](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241101200210599.png)

##### 核心代码

```java
public abstract class AbstractHandler {
    @Setter
    protected AbstractHandler abstractHandler;

    public String logMessage(String message){
        if(abstractHandler!=null){
             return message +"-"+ abstractHandler.logMessage(message);
        }
        return "-end";
    }
}
public class Handler extends AbstractHandler{

    public String log(String s){
        return this.logMessage(s);
    }
}
```

##### 调用

```java
@Service
public class HandlerServiceImpl implements HandlerService{
    @Override
    public String go() {
        Handler handler1=new Handler();
        Handler handler2=new Handler();
        Handler handler3=new Handler();
        Handler handler4=new Handler();
        handler1.setAbstractHandler(handler2);
        handler2.setAbstractHandler(handler3);
        handler3.setAbstractHandler(handler4);
        return handler1.log("111");
    }
}
```

##### 测试

![image-20241101195822038](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241101195822038.png)

### 命令模式（CommandPattern）

​	行为型设计模式。

​	将一个请求封装为一个对象，从而使用户可用不同的请求对客户进行参数化。

​	将接受者和请求者完全解耦。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/CommandPattern

![image-20241102193956277](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241102193956277.png)

##### 流程解读

![image-20241102194306194](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241102194306194.png)

##### 核心代码

~~~java
public interface Command {
    public String excute();
}
public class Manager {
    private final ArrayList<Command> commands = new ArrayList<>();
    public void addCommand(Command command) {
        commands.add(command);
    }
    public String executeCommand() {
        StringBuilder result= new StringBuilder();
        for (Command command : commands) {
            result.append(command.excute());
        }
        commands.clear();
        return result.toString();
    }
}
public class A implements Command{
    @Override
    public String excute() {
        return "A";
    }
}
~~~

##### 调用

```java
@Service
public class AServiceImpl implements AService{
    @Override
    public String go() {
        Manager manager=new Manager();
        manager.addCommand(new A());
        manager.addCommand(new A());
        manager.addCommand(new A());
        return manager.executeCommand();
    }
}
```

##### 测试

![image-20241102193911433](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241102193911433.png)

### 观察者模式（ObserverPattern）

​	行为型设计模式。	

​	定义对象间的一种一对多的依赖关系，使得每当一个对象状态发生变化改变时，器相关依赖对象皆得到通知并自动更新。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/ObserverPattern

![image-20241102200623546](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241102200623546.png)

##### 流程解读

![image-20241102200806772](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241102200806772.png)

##### 核心代码

~~~java
public abstract class Number {
    protected Subject subject;
    public abstract String update();
}
public class Subject {
   private List<Number> numbers = new ArrayList<Number>();
   @Getter
   private int state;
   public String setState(int state) {
      this.state = state;
      return notifyAllNumber();
   }
   public void attach(Number number){
      numbers.add(number);
   }
   public String notifyAllNumber(){
      StringBuilder result= new StringBuilder();
      for (Number number : numbers) {
         result.append(number.update());
      }
      return result.toString();
   }
}
public class BinaryNumber extends Number{
 
   public BinaryNumber(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
 
   @Override
   public String update() {
      return "Binary String: "+ Integer.toBinaryString( subject.getState());
   }
}
~~~

##### 调用

```java
@Service
public class NumberServiceImpl implements NumberService{
    @Override
    public String go() {
        Subject subject=new Subject();
        new BinaryNumber(subject);
        return subject.setState(15);
    }
}
```

##### 测试

![image-20241102200537415](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241102200537415.png)

### 中介者模式（MediatorPattern）

​	属于行为型设计模式。

​	用一个中介对象来封装一系列的对象交互，中介者使各个对象不需要显示地互相调用，从而使其耦合松散，而且可以独立地改变它们之间的交互。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/MediatorPattern

![image-20241103141241012](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241103141241012.png)

##### 流程解读

![image-20241103141545144](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241103141545144.png)

##### 核心代码

~~~java
public class Mediator {
    public static String message(User user,String message){
        return user+":"+message+"---->";
    }
}
@Data
public class User {
    String name;
    public User(String name){
        this.name=name;
    }
    public String sendMessage(String message){
        return Mediator.message(this,message);
    }
}
~~~

##### 调用

~~~java
@Service
public class TalkServiceImpl implements TalkServcie{
    @Override
    public String go() {
        User a=new User("aa");
        User b=new User("bb");
        String result="";
        result+=a.sendMessage("WoShiAa");
        result+=b.sendMessage("WoShiBb");
        return result;
    }
}
~~~

##### 测试

![image-20241103141151026](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241103141151026.png)

​	

### 迭代器模式（IteratorPattern）

​	属于行为型设计模式。

​	提供一种方法来访问聚合对象，而用暴露这个对象的内部表示。

​	迭代器模式在大部分语言类库中已经实现，现在已经很少使用自定义迭代器，在此不做出实例解释，通过联想到大部分语言的迭代器即可理解相应逻辑。

~~~c++
for(auto a : array)
~~~

### 访问者模式（VisitorPattern）

​	属于行为型设计模式。

​	表示一个作用于某对象结构中的个元素的操作，它使人们可以在不改变各元素的类的前提下定义作用于这些元素的新操作。

​	通过只添加visitor类，来增加对象的不同行为模式。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/VisitorPattern

![image-20241103160310203](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241103160310203.png)

##### 流程解读

![image-20241103160847673](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241103160847673.png)

##### 核心代码

```java
public interface P {
    public String run(Visitor visitor);
}
public class B implements P{
    @Override
    public String run(Visitor visitor) {
        return visitor.visitor(this);
    }
}
public class A implements P{
    @Override
    public String run(Visitor visitor) {
        return visitor.visitor(this);
    }
}public class DisaplayVisitor implements Visitor{
    @Override
    public String visitor(A a) {
        return "AAAA";
    }

    @Override
    public String visitor(B a) {
        return "BBBB";
    }
}
public interface Visitor {
    public String visitor(A a);
    public String visitor(B a);
}
```

##### 调用

```java
@Service
public class PpServiceImpl implements PpService{

    @Override
    public String go() {
        A a = new A();
        B b=new B();
        return a.run(new DisaplayVisitor())+b.run(new DisaplayVisitor());
    }
}
```

##### 测试

![image-20241103160158298](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241103160158298.png)

### 备忘录模式（MementoPattern）

​	属于行为型设计模式。

​	在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象回复到原先保存的状态。

#### 代码示例

​	所在文件夹：DesignPattern/src/main/java/com/designpattern/designpattern/MementoPattern

![image-20241103162513091](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241103162513091.png)

##### 流程解读

![image-20241103162827127](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241103162827127.png)

##### 核心代码

```java
@Data
public class A {
    String state;
    public A(){
    }
    public A(A a){
        this.state=a.state;
    }
}
public class Memento {
    private List<A> mementoList = new ArrayList<A>();

    public void add(A state){
        mementoList.add(state);
    }

    public A get(int index){
        return mementoList.get(index);
    }
}
```

##### 调用

```java
@Service
public class MementoServiceImpl implements MementoService{
    @Override
    public String go() {
        Memento memento = new Memento();
        A a = new A();
        a.setState("11");
        memento.add(new A(a));
        String res="";
        res+=a.getState();
        a.setState("22");
        memento.add(new A(a));
        res+=a.getState();
        a=memento.get(0);
        res+=a.getState();
        return res;
    }
}
```

##### 测试

![image-20241103162430026](https://raw.githubusercontent.com/Djhhhhhh/MyPic/master/image-20241103162430026.png)

### 解释器模式（InterpreterPattern）

​	行为型设计模式。

​	定义语言的文法，并建立一个解释器来解释该语言中的句子。

​	显而易见，正则表达式属于该模式，故在此不做解释代码示例。
