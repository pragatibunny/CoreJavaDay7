# CoreJavaDay7
1.Write a java program to print current date and time in the specified format. 

2.Write a Java program to extract date, time from the date string 

3.Write a Java program to get and display information (year, month, day, hour, minute) of a default calendar 

4.Write a Java program to get the maximum value of the year, month, week, date from the current date of a default calendar 

5..Given two inputs year and month (Month is coded as: Jan=0, Feb=1 ,Mar=2 ...), write a program to find out total number of days in the given month for the given year. 

6.Include a class UserMainCode with a static method “getNumberOfDays” that accepts 2 integers as arguments and returns an integer. The first argument corresponds to the year and the second argument corresponds to the month code. The method returns an integer corresponding to the number of days in the month. 

Create a class Main which would get 2 integers as input and call the static method getNumberOfDays present in the UserMainCode. 

Input and Output Format: 

Input consists of 2 integers that correspond to the year and month code. 

Output consists of an integer that correspond to the number of days in the month in the given year. 

Sample Input: 

2000 

1 

Sample Output: 

29 

7.Write a program to read a string  and to test whether first and last character are same. The string is said to be be valid if the 1st and last character are the same. Else the string is said to be invalid. 

Include a class UserMainCode with a static method checkCharacters which accepts a string as input . 

The return type of this method is an int.  Output should be 1 if the first character and last character are same . If they are different then return -1 as output. 

Create a class Main which would get the input as a string and call the static method checkCharacters present in the UserMainCode. 

  

Sample Input : 

the picture was great 

Sample Output : 
Valid 
  

Sample Input : 

this 

Sample Output : 

Invalid 

 

8. Write a code to read two int array lists of size 5 each as input and to merge the two arrayLists, sort the merged arraylist in ascending order and fetch the elements at 2nd, 6th and 8th index into a new arrayList and return the final ArrayList. 

 Include a class UserMainCode with a static method sortMergedArrayList which accepts 2 ArrayLists. 

 The return type is an ArrayList with elements from 2,6 and 8th index position .Array index starts from position 0. 

 Create a Main class which gets two array list of size 5 as input and call the static method sortMergedArrayList present in the UserMainCode. 

Sample Input: 

3 

1 

17 

11 

19 

5 

2 

7 

6 

20 

Sample Output: 

3 

11 

19 

Sample Input : 

1 

2 

3 

4 

5 

6 

7 

8 

9 

10 

Sample Output : 

3 

7 

9 

 

9. A Company wants to obtain employees of a particular designation. You have been assigned as the programmer to build this package. You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps: 

    Read Employee details from the User. The details would include name and designaton in the given order. The datatype for name and designation is string. 

    Build a hashmap which contains the name as key and designation as value. 

    You decide to write a function obtainDesignation which takes the hashmap and designation as input and returns a string array of employee names who belong to that designation as output. Include this function in class UserMainCode. 

Create a Class Main which would be used to read employee details in step 1 and build the hashmap. Call the static method present in UserMainCode. 

Sample Input 1: 

4 

Manish 

MGR 

Babu 

CLK 

Rohit 

MGR 

Viru 

PGR 

MGR 

 

Sample Output 1: 

Manish 

Rohit 

10.Write a program to read  two String variables in DD-MM-YYYY.Compare the two dates and return the older date in 'MM/DD/YYYY' format. 

Include a class UserMainCode with a static method findOldDate which accepts the string values. The return type is the string. 

Create a Class Main which would be used to accept the two string values and call the static method present in UserMainCode. 

Sample Input 1: 

05-12-1987 

8-11-2010 

Sample Output 1: 

12/05/1987 

11.Given a method with two date strings in yyyy-mm-dd format as input. Write code to find the difference between two dates in months.  

Include a class UserMainCode with a static method getMonthDifference which accepts two date strings as input.  

The return type of the output is an integer which returns the diffenece between two dates in months.  

Create a class Main which would get the input and call the static method getMonthDifference present in the UserMainCode. 

  

Sample Input 1: 

2012-03-01 

2012-04-16 

Sample Output 1: 

1 

Sample Input 2: 

2011-03-01 

2012-04-16 

Sample Output 2: 

13 

 

12.Write a program to read a string and validate the IP address. Print “Valid” if the IP address is valid, else print “Invalid”. 

  

Include a class UserMainCode with a static method ipValidator which accepts a string. The return type (integer) should return 1 if it is a valid IP address else return 2. 

Create a Class Main which would be used to accept Input String and call the static method present in UserMainCode. 

 

Note: An IP address has the format a.b.c.d where a,b,c,d are numbers between 0-255. 

  

Sample Input 1: 

132.145.184.210 

Sample Output 1: 

Valid 

  

Sample Input 2: 

132.145.184.290 

Sample Output 2: 

Invalid 

  

13.Get two date strings as input and write code to find difference between two dates in days. 

Include a class UserMainCode with a static method getDateDifference which accepts two date strings as input. 

The return type of the output is an integer which returns the diffenece between two dates in days. 

Create a class Main which would get the input and call the static method getDateDifference present in the UserMainCode. 

  

Sample Input 1: 

2012-03-12 

2012-03-14 

Sample Output 1: 

2 

 
Sample Input 2: 

2012-04-25 

2012-04-28 

Sample Output 2: 

3 

 

14.Given a date string in the format dd/mm/yyyy, write a program to convert the given date to the format dd-mm-yy. 

Include a class UserMainCode with a static method “convertDateFormat” that accepts a String and returns a String. 

 Create a class Main which would get a String as input and call the static method convertDateFormat present in the UserMainCode. 

Sample Input: 

12/11/1998 

  

Sample Output: 

12-11-98
