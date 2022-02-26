API
===

All API endpoints return
{ 
  success: false
}
on failure with no other values by default.

User POV
--------
* Check event PIN (first screen)
    * Args: 
      - Event PIN
    * Returns:
      - Success
      - Approx wait time (no trip in calculation)

* Get trip wait time
    * Args: 
      - From (addr)
      - Destination list (addrs)
      - Name
      - Phone number
      - Event PIN
    * Returns:
      - Success
      - Wait time
    * Notes:
      - Should FAIL if trip already exists 
        with phone number
      - Should FAIL if Event PIN doesn't exist

* Submit new trip
    * Args: 
      - From
      - Destination list
      - Name
      - Phone number
      - Event PIN
    * Returns:
      - Success
      - Driver information
        - Name
        - Phone number
      - ETA
      - Number of people
      - From (addr)
      - Destination list (addrs)
    * Notes:
      - Should FAIL if trip already exists 
        with phone number
      - Should FAIL if Event PIN doesn't exist

* View trip details
    * Args: 
      - Event PIN
      - Phone number
    * Returns:
      - Success
      - ... trip info described above ...

Admin/Driver POV
----------------
* 

