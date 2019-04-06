ReadMe
Jarin James


COSC310_Lab2_G16


Github repository: https://github.com/jjames2699/Assignment-3-COSC-310

The purpose of the program we created is to assist users in solving their technology problems. This chatbot is similar to ones you would see on websites such as TELUS where the chatbot leads the user through a series of questions in order to attempt to solve the users tech problems. In order to run the program in eclipse you will need to complete the following steps:

  1.	Download and install Eclipse.
  2.	In your browser, open the URL for the github repository , click accept, click the URL then click Clone and copy the URL
  3.	In Eclipse, File - import - git - projects from Git - clone URI then enter the URI.
To run the chatbot you need to run Testing.java. There are 1 classes in this project : DecisionMatrix.java, EdgeBuilder.java, Question.java, QuestionBuilder.java, QuestionBuilderTest.java, Run.java, StackHandler.java, Testing.java, Tree.java, and UserInput.java, GUI.java, and Stemmer.java. DecisionMatrix.java is the program that decides what the program does for a given input. For example, if the user answers a question in a way that the program does not understand, it will respond by saying, “Did not understand that, please try again”. It also determines whether or not the program is finished or needs to keep going. EdgeBuilder.java Takes an ArrayList of unlinked questions (children nodes empty), and links all of the nodes together using branchID and questionPriority. Question.java contains info from individual question file. QuestionBuilder.java gets all question files in a specified directory and reads them into new Question objects while QuestionBuilderTest.java tests it. StackHandler.java ensures that the stack we have created runs smoothly. Testing.java is the main testing class. Tree.java creates a tree that holds the questions. UserInput.java is all the answers that the user inputs. Testing.java is the main class that runs the chatbot. GUI.java is the class that handles the graphical user interface. Stemmer.java 

I created a GUI for the chatbot. I also implemented 5 different responses when the user enters something outside the two topics. For example, if a user responds television, the program will respond, “Sorry we can't help with your television problems just yet, please try again.” If a user responds, “neither” it will respond “Sorry we can only help with internet or phone related problems.” Similarly, if a user enters “both”, the program will counter, “Okay, lets try to fix one problem first.” If the user inputs “tablet” the response will be, “We don't have specific instructions on how to deal with tablet related problems. You can try using the phone feature to attempt to solve your problem.” Finally, if a user enters “video game” the response will be, “We don't have specific instructions on how to deal with video game related problems.” I also implemented Porter Stemmer to deal with spelling issues. I also amended the text files to better handle synonyms. 5 features that can be taken from my code or design that can be shared with others as an API are: the decision matrix, the Porter Stemmer, the stack handler, the question builder and the edge builder.


Presentation : https://docs.google.com/presentation/d/1Ea2D9HW08Jh0rILo2tFkx1aWkfZRnH13u-_Ipa5z5uA/edit?usp=sharing