#Airly
2nd project for object-oriented programming classes. 
Allows you to read the information about the air quality in specified area.
#Options
 - read the sensor's information providing sensor's id
 - read the sensor's information providing geographic longitude and latitude
 
You can get the sensor's information from Airly's air quality map at: https://map.airly.eu/en/
Providing longitude and latitude information returns information for the nearest sensor if such is found.
#Parameters
 - --api-key - provide your own api key that you can get at Airly's website
 - --history - allows you to see the air quality's history for the last 24hrs
 - --sensor-id - provide sensor's id to see air quality information for the specific sensor
 - --longitude & --latitude - provide both parameters instead of sensor-id to get the nearest
 sensor's information