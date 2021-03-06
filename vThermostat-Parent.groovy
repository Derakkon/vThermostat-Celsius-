definition(
    name: "vThermostat Manager",
    namespace: "Derakkon",
    author: "Josh McAllister & Derakkon",
    description: "Join any sensor(s) with any outlet(s) for virtual thermostat control.",
    category: "Green Living",
    iconUrl: "https://raw.githubusercontent.com/josh208/hubitat/master/vThermostat/vThermostat-logo-small.png",
    iconX2Url: "https://raw.githubusercontent.com/josh208/hubitat/master/vThermostat/vThermostat-logo.png",
	singleInstance: true
)

preferences {
    page(name: "Install", title: "vThermostat Manager", install: true, uninstall: true) {
        section("Devices") {
        }
        section {
            app(name: "thermostats", appName: "vThermostat Child", namespace: "Derakkon", title: "Add vThermostat", multiple: true)
        }
    }
}

def installed() {
	initialize()
}

def updated() {
	unsubscribe()
	initialize()
}

def initialize() {
}