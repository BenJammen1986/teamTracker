# _TeamTracker_

#### _TeamTracker, 03-24-2017_

#### By _**Ben Schenkenberger**_

## Description
_This app is designed to allows coordinators of programming events (hack-a-thons, Startup Weekends, etc...) to create and organize lists of teams and team members that will be participating in said events._


## Specifications

| Behavior                   | Input Example     | Output Example    |
| -------------------------- | -----------------:| -----------------:|
| 1. A team can be created. | Team Buzzsaw | Team Buzzsaw |
| 2. The team name is saved correctly. | Team Buzzsaw | Team Buzzsaw |
| 3. A list is created that will store all team names. | Team Buzzsaw, Team OpenSource | Team Buzzsaw, Team OpenSource |
| 4. Each team is assigned a unique ID; can be individually accessed | Team Buzzsaw | /team/1 |
| 5. A team member can be created. | Joe | Joe |
| 6. A team member's name is saved correctly. | Joe | Joe |
| 7. A list is created that will store all members ever created. | Joe, Ben | Joe, Ben |
| 8. Each team member is assigned a unique ID; can be individually accessed | Joe | /teammember/1 |
| 9. A list is created that stores all members within a team. | Joe, Ben | Joe, Ben |


## Setup/Installation Requirements

* _Clone the repository_
* _Open your terminal interface (command line)_
* _Run the command 'gradle run'_
* _Open browser and go to localhost:4567_


### License

Copyright (c) 2017 **_Ben Schenkenberger_**

This software is licensed under the MIT license.
