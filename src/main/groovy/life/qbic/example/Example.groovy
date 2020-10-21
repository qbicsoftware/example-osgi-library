package life.qbic.example


class Example {

    /**
     * Creates a message including a random number, the fully-qualified class name an the
     * ClassLoader instance.
     *
     * @return String message including random number, fully-qualified class name
     *         and ClassLoader instance
     */
    static String getRandomNumberMessage() {
        int number = new Random().nextInt()

        String message = sprintf("Random Number: %d \nGenerated by %s \nLoaded by %s",
                number, Example.class, Example.class.getClassLoader())


        return message
    }
}
