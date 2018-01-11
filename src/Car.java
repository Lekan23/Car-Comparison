
/**
 * Car class that extends the Vehicle class
 * @author jaron harris
 *
 */
class Car extends Vehicle{
	
/**
 * Car constructor that passes in engine, wheels and windows
 * @param engine - all the engine components 
 * @param wheels - all the wheel components
 * @param windows - all the window components
 */
	public Car(Engine engine, Wheels wheels, Window windows) {
		super(engine, wheels, windows);
		engine = engine;
		wheels = wheels;
		windows = windows;
	}
/**
 * Display wheel pressure method that returns the wheel pressure
 */
	@Override
	public double displayWheelPressure() {
		System.out.printf("Display Wheel Pressure: %d", wheels.getPressure());
		return wheels.getPressure();
	}
/**
 * Compute window area method that returns window area
 */
	@Override
	public double computeWindowArea() {
		System.out.printf("The area of the window is: %d", windows.ComputeWindowArea());
		return windows.ComputeWindowArea();
	}
/**
 * Displays the valve number	
 */
	public int displayValveNumber(){
		System.out.printf("Display the number of valves: %d", engine.numOfValves);
		return engine.numOfValves;
	}

}

/**
 * Vehicle class that is abstract
 * @author jaron harris
 *
 */
    abstract class Vehicle{
	
	 Engine engine;
	 Wheels wheels;
	 Window windows;
/**
 * Constructor that passes in engine, wheels and windows	
 * @param engine - all components in engine
 * @param wheels - all components in wheels
 * @param windows - all components in windows
 */
	public Vehicle(Engine engine, Wheels wheels, Window windows){
		
	}
/**
 * Abstract method - displayWheelPressure
 * @return
 */
	public abstract double displayWheelPressure();
/**
 * Abstract method computeWindowArea	
 * @return
 */
	public abstract double computeWindowArea();
/**
 * DisplayValveNumber method 	
 * @returns number of valves in the engine
 */
	public int displayValveNumber(){
		System.out.printf("Display the number of valves: %d",engine.numOfValves);
		return engine.numOfValves;
	}
}

/**
 * Engine Class
 * @author jaron
 *
 */
   class Engine {
/**
 * Different components in the engine
 */
	public double cylinderCapacity;
	public int numOfCylinders;
	public int numOfValves;
	public double horsePower;
	
/**
 * Constructor that passes in the different components of an engine	
 * @param cC - cylinder capacity
 * @param numOfCylinders - number of cylinders
 * @param numOfValves - number of valves
 * @param horsePower - horse power
 */
	Engine(int cC, int numOfCylinders, int numOfValves, int horsePower) {
		super();
		this.cylinderCapacity = cC;
		this.numOfCylinders = numOfCylinders;
		this.numOfValves = numOfValves;
		this.horsePower = horsePower;
	}
	
/**
 * Start method
 */
	public void start(){
		System.out.println("The start statement was called");
	}
/**
 * Stop method	
 */
	public void stop(){
		System.out.println("The stop statement was called");
	}
/**
 * Get horse power method	
 * @returns horse power
 */
	public double getHorsePower(){
		return horsePower;
	}
/**
 * Set horse power method
 * @param horsePower
 */
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	
	
}

/**
 * Wheels class
 * @author jaron
 *
 */
   class Wheels {
/**
 * The components that make up a wheel	
 */
	public int numWheels;
	public double wheelSize;
	public int pressure;
/**
 * Constructor that passes in the components of a wheel	
 * @param numWheels - number of wheels of the car
 * @param wheelSize - size of the wheel
 * @param pressure - the amount of pressure the wheel has
 */
	Wheels(int numWheels, double wheelSize, int pressure) {
		super();
		this.numWheels = numWheels;
		this.wheelSize = wheelSize;
		this.pressure = pressure;
	}
/**
 * Get pressure method
 * @returns pressure of the wheel
 */
	public int getPressure() {
		return pressure;
	}
/**
 * Set pressure method
 * @param pressure
 */
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	
	
	
}
/**
 * Window class
 * @author jaron
 *
 */
   class Window {
/**
 * Components of a window of a car
 */
	public int numWindows;
	public double widthOfWindow;
	public double heightOfWindow;

/**
 * Constructor that passes in the components of a window	
 * @param numWindows - number of windows of the car
 * @param widthOfWindow - width of the window
 * @param heightOfWindow - height of the window
 */
	Window(int numWindows, double widthOfWindow, double heightOfWindow) {
		this.numWindows = numWindows;
		this.widthOfWindow = widthOfWindow;
		this.heightOfWindow = heightOfWindow;
	}
/**
 * Roll up method command	
 */
	public void rollUp(){
		System.out.println("The Window was rolled up");
	}
/**
 * Roll down method command	
 */
	public void rollDown(){
		System.out.print("The Window was rolled down");
	}
/**
 * Compute window area method that computes the area of the window	
 * @returns the height x width
 */
	public double ComputeWindowArea(){
		return widthOfWindow * heightOfWindow;
	}
}
   
/**
 * Test car class
 * @author jaron
 *
 */
    class TestCar {
/**
 * Main class
 * @param args
 */
	public static void main(String[] args) {
	/**
	 * Engine, wheel, and window objects for first car "Benz"
	 */
		Engine eng = new Engine(2400, 4, 16, 180);
		Wheels wheel = new Wheels(4, 265, 33);
		Window window = new Window(4, 50,45);
	/**
	 * Displays the output of the first car	
	 */
		System.out.printf("Info about the first car.\n\n");
		System.out.printf("The pressure of wheel is: %d \n",wheel.getPressure());
		System.out.printf("The area of the window is: %.2f\n", window.ComputeWindowArea());
		System.out.printf("This is the car version of the method displayWindowArea(): The number of valves is %d \n",eng.numOfValves);
		System.out.printf("The horse power of the engine is: %.2f \n\n",eng.getHorsePower());
		
		Car firstCar = new Car(eng, wheel, window);
	/**
	 * Engine, wheel, and window objects of second car "Honda"
	 */
		Engine eng1 = new Engine(2300, 4, 24, 200);
		Wheels wheel1 = new Wheels(4, 225, 35);
		Window window1 = new Window(4, 60, 50);
	/**
	 * Displays the output of the second car	
	 */
		System.out.printf("Info about the second car.\n\n");
		System.out.printf("The pressure of wheel is: %d \n",wheel1.getPressure());
		System.out.printf("The area of the window is: %.2f\n", window1.ComputeWindowArea());
		System.out.printf("This is the car version of the method displayWindowArea(): The number of valves is %d \n",eng1.numOfValves);
		System.out.printf("The horse power of the engine is: %.2f",eng1.getHorsePower());
		
		Car secondCar = new Car(eng1, wheel1, window1);
		
		
		
	}

}
