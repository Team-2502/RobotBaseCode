package com.team2502.robotBase;

/**
 * Exclusively for defining Button ID's, Solenoid ID's, Motor ID's, and other kinds of ID's
 * Stuff like conversion constants DO NOT belong here
 */
public class RobotMap
{

    private RobotMap()
    {

    }

    /**
     * Define Joystick ID's and button ID's
     */
    public static final class Joystick
    {
        public static final int JOYSTICK_DRIVE_LEFT = 1;
        public static final int JOYSTICK_DRIVE_RIGHT = 0;
        public static final int JOYSTICK_FUNCTION = 2;
        public static final int JOYSTICK_SIDE_PANEL = 3;

        private Joystick() { }

        /**
         * Define Button ID's, which should be used in OI.java
         */
        public static final class Button
        {
            private Button() { }
        }
    }

    /**
     * Define Motor Controller ID's
     */
    public static final class Motor
    {
        public static final int DRIVE_TRAIN_FRONT_RIGHT = 1;
        public static final int DRIVE_TRAIN_BACK_RIGHT = 2;
        public static final int DRIVE_TRAIN_FRONT_LEFT = 3;
        public static final int DRIVE_TRAIN_BACK_LEFT = 4;

        public static final int CARGO_LOWER_BELT = 5;
        public static final int CARGO_UPPER_BELT = 6;

        public static final int CLIMBER_LEFT = 7;
        public static final int CLIMBER_RIGHT = 8;
        public static final int CLIMBER_CLAW_LEFT = 9;
        public static final int CLIMBER_CLAW_RIGHT = 10;

        private Motor() { }
    }

    /**
     * Define Solenoid ID's
     */
    public class Solenoid
    {
        /*
         * HATCH_INTAKE ------ 4
         */

        public static final int HATCH_INTAKE = 4;
        public static final int FLIP_OUTS = 3;
        public static final int OBA = 2;

        private Solenoid() { }
    }
}