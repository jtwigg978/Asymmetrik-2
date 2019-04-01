# Asymmetrik Programming Challenge Mobile Device Keyboard 
Author: Jacob Twigg 

In the src folder, the three classes used for the exercise can be found. The Main.java class is the driver, which is where you will be able to test any sentence that you would like. The src folder just needs to be downloaded, compiled, and then Main should be run. The "passage" String that is defined in Main can be changed to whatever sentence or paragraph the user desires to test. The "figment" String can also be changed to the section of a word that will be tested for the autocomplete. 

The autocomplete provider will suggest any words that contain the fragment. Words with special characters such as dashes (-) and apostrophes (') will be autocompleted with those special characters in mind. For example, "Wouldn't" will be suggest with the apostrophe. Also, numbers are also allowed to be suggested. This is because some people may type using numbers, such as "Gr8". This will be autocompleted from "gr". This functionality can be easily removed if necessary by slightly changing the regex used in AutocompleteProvider.java. 

A few JUnit tests I created and used have been included in the Tests folder as well. 
