We want to build a cab booking platform to allow a rider to book a cab.

Details:
1. The location is represented as a (x, y) coordinate.
2. Distance between two points (x1, y1) and(x2, y2) is sqrt((x1-x2)^2 + (y1-y2)^2)
3. Platform has decided upon maximum distance a driver has to travel to pickup a rider.
4. A cab has only 1 driver.
5. Sharing of cab is not allowed between riders
6. There is a single type of cab

Please build an application that exposes following features to riders and drivers.
1. Register a rider.
2. Register a driver/cab
3. Update a cab's location
4. A driver can switch on/off his availability
5. A rider can book a cab
6. Fetch history of all rides taken by a rider.
7. End the Trip

Rider

Driver
 => 


DriverRepository

DriverLocationRepository

Register Flow 