open class Vehicle(val name: String = "Car", val speed: Int = 120) {
    open fun start() {
        println("Car is starting moving with speed ${speed-70}")
    }

    open fun stop() {
        println("$name is stopping moving with speed ${speed}")
    }
}

class Tank (name: String = "Tank", speed: Int = 60) : Vehicle(name = name, speed = speed) {
   override fun start() {
        println("Tank is starting moving with speed ${speed-30}")
    }

    override fun stop() {
        println("Tank is stopping moving with speed ${speed}")
    }
}

class boat (name: String = "Tank", speed: Int = 200) : Vehicle(name = name, speed = speed) {
    override fun start() {
        println("Tank is starting moving with speed ${speed-150}")
    }

    override fun stop() {
        println("Tank is stopping moving with speed ${speed}")
    }
}

class airPlane (name: String = "AirPlane", speed: Int = 350) : Vehicle(name = name, speed = speed) {
    override fun start() {
        println("Tank is starting moving with speed ${speed-300}")
    }

    override fun stop() {
        println("Tank is stopping moving with speed ${speed}")
    }
}