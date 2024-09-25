package ait.textmanipulator.infra;

import java.lang.reflect.Method;

public class ActionUtils {
    public static void executeAction(String inputFile, String outputFile, String actionName) {
        try {
            actionName = actionName.substring(0, 1).toUpperCase() + actionName.substring(1).toLowerCase();
            String className = "ait.textmanipulator.action." + actionName + "Action";
            Class<?> clazz = Class.forName(className);
            Method method = clazz.getDeclaredMethod("performAction", String.class, String.class);
            method.invoke(clazz.getDeclaredConstructor().newInstance(), inputFile, outputFile);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(actionName + " doesn't exists");
        }
    }
}
