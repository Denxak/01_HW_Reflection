package ait.textmanipulator.infra;

import ait.textmanipulator.action.Actions;

import java.lang.reflect.Method;

public class ActionUtils {
    public static void executeAction(String inputFile, String outputFile, String actionName) {
        Class<Actions> clazz = Actions.class;
        try {
            actionName = actionName.toLowerCase();
            Method method = clazz.getDeclaredMethod(actionName, String.class, String.class);
            method.setAccessible(true);
            method.invoke(clazz.getDeclaredConstructor().newInstance(), inputFile, outputFile);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(actionName + " doesn't exists");
        }
    }
}
