package org.aelion.utils.factory;

import java.lang.reflect.InvocationTargetException;

import org.aelion.services.CardGame;

/**
 * Singleton : only once GameCard instance will be return
 * Factory : let a method create instance instead of manually create instance
 */
public class GameFactory {
    private static final String packageRoot = "org.aelion.services.impl.";
    private static CardGame instance;

    private String game;

    private GameFactory(String game) {
        this.game = game;
    }

    public static CardGame getInstance(String game) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        if (GameFactory.instance != null) {
            return GameFactory.instance;
        }

        GameFactory factory = new GameFactory(game);
        GameFactory.instance = factory.createInstance();

        return GameFactory.instance;
    }

    private CardGame createInstance() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
        StringBuilder sbClassName = new StringBuilder();
        sbClassName
            .append(packageRoot)
            .append(this.game);
        String className = sbClassName.toString();

        Class<CardGame> game = (Class<CardGame>) Class.forName(className);

        return game.getDeclaredConstructor(null).newInstance(null);
    }
}
