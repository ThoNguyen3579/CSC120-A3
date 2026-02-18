Use this file to record your reflection on this assignment.

- Which classmates did you consult with while working on this assignment? 
Emmarie Miller! We are collaborating and she is amazingly helpful!
- Which session(s) of TA / office hours did you attend? 
I attended the TA hours on Monday.

- What are your initial impressions of Java? 
Honestly, I have only known about Java in this class, and it is pretty scary to learn such a different language.

- Can you draw any conclusion about programming in general from the similarities or the differences between the two languages? 
I jut feel like Java, in addition to the Object Oriented Programming, is so much the same as learning a new language with a little bit resemblance to Python. It feels more complicated and requires more details (classes, contributors, etc.). Java also requires very careful type definition.

- What worked, what didn't, what advice would you give someone taking this course in the future?
It just took me lots of time to figure things out, so I am sooo grateful to have my collaborator and the TA help me! They helped me with the for loop for the conversation and the randomization part, and I just fully understood it thanks to them! 
Personally, I really appreciate the brainstorming part (although all my brain cells are exploding when doing A3!) because it allows me to develop the logic and syntax for Java so well! This task also proves the importance of collaboration, because I know that I would not have been able to finish this task by myself alone!
Although I am done with most of the assignment, the mirroring part is still a bit funky (the space, the punctuation). Hia has suggested me instead of changing the inputString, we create returnString as a copy the inputString and then replace the words in the returnString. However, that have not really solved the spacing problem (since we still have to split the string into words in order to make it really work). And also, if my mirror word has punctuation (for instance: thank you.), it will answer "thank you.?" instead of "thank I?". However, I cannot use replace because the replace function will change the letter instead of the whole word (for instance, thinking -> thyounkuoung). Also, currently, I have not figured out how to rule out certain words that contain the mirror words like "I" (for instance: thinking).

The space problem (the created responses acting weird with the spaces it has) and the replace problem (instead of replacing every "i", it only replace the specific "i" element that is being pointed at) has been solved through using the same method now! Instead of only using one list like before, in respond method, I used two lists prep_arr and arr with the exact same elements at the start. Then, I used the prep_arr like an anchor and the arr as for modification (using set instead of replaceAll function), and it work! I have a much better understanding of arrayList vs List now: String [] refer to an unmodifiable list, while arrayList can be modified!.
