class Light {
    // computing the distance light travels using long variables
    public static void main(String args[]) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // approx speed of light in miles per second
        lightspeed = 186000;

        // specified number of days
        days = 1000;

        // convert to seconds
        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;

        System.out.print("In " + days);
        System.out.print(" days, light will travel about ");
        System.out.println(distance + " miles.");
    }
}