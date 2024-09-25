package ait.textmanipulator;

import ait.textmanipulator.infra.ActionUtils;

public class ActionAppl {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Wrong number of arguments");
            return;
        }
        ActionUtils.executeAction(args[0], args[1], args[2]);
    }
}
