package com.designpattern.designpattern.SimpleFactoryPattern.model;

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
