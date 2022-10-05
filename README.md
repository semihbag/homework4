# homework4

# question_1

Write a program that calculates the invoice of each flat in an apartment building. Assume that there are N flats in a building and apartment heating is the central       
system. 30% of bill will be shared equally among the flats, the rest 70% will be shared according to the consumption of each flat.      
Sample Calculation:     
• Suppose that an apartment building has 3 flats      
• Consumption of each flat (m3): 12.8, 23, 9.2      
• Total Bill: 320.40 TL     
o 30% of bill: 96.12 TL     
o 70% of bill: 224.28 TL      
• Then, the bill for each flat should be calculated as follows:       
o The bill for Flat #1: 32.04 + 63.80 = 95.83 TL      
o The bill for Flat #2: 32.04 + 114.63 = 146.67 TL      
o The bill for Flat #3: 32.04 + 45.85 = 77.89 TL      

Sample Run 1 (Input: 3 12.8 23 9.2 320.40)        
3 12.8 23 9.2 320.40      
Flat #1: 95.83      
Flat #2: 146.67     
Flat #3: 77.89      

Sample Run 2 (Input: 15 12 14.2 15.87 21.4 19 13 8.1 11 15.14 16 23.14 27 5.98 7.18 17 812.90)        
15 12 14.2 15.87 21.4 19 13 8.1 11 15.14 16 23.14 27 5.98 7.18 17 812.90      
Flat #1: 46.47      
Flat #2: 52.0     
Flat #3: 56.21      
Flat #4: 70.13      
Flat #5: 64.09      
Flat #6: 48.98      
Flat #7: 36.65      
Flat #8: 43.95      
Flat #9: 54.37      
Flat #10: 56.54     
Flat #11: 74.51     
Flat #12: 84.23     
Flat #13: 31.31       
Flat #14: 34.33     
Flat #15: 59.05         

Sample Run 3 (Input: 5 44.02 0 17 21.01 7.56 210.82)      
5 44.02 0 17 21.01 7.56 210.82      
1.Flat: 85.15     
2.Flat: 12.64     
3.Flat: 40.65     
4.Flat: 47.25     
5.Flat: 25.1      

# question_2

Write a program that will determine whether or not it is valid per the Luhn formula. The Luhn algorithm is a simple checksum formula used to validate a variety of    
identification numbers, such as credit card numbers. The task is to check if a given string is valid.   

Example 1: valid credit card number       
Suppose that the following number is given as the input:      
4539 1488 0343 6467       
• The first step of the Luhn algorithm is to double every second digit, starting from the right. We will be doubling      
4_3_ 1_8_ 0_4_ 6_6_       
• If doubling the number results in a number greater than 9 then subtract 9 from the product. The results for our example:    
8569 2478 0383 3437     
• Then, calculate the sum all of the digits:      
8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80      
• If the sum is evenly divisible by 10, then the number is valid.     
80 is divisible by 10, and the quotient is 8 (even)     
Then, the given number is valid!      

Example 2: invalid credit card number     
Suppose that the following number is given as the input:        
8273 1232 7352 0569     
• Double the second digits, starting from the right       
7253 2262 5312 0539       
• Sum the digits      
7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57      
• 57 is not evenly divisible by 10, so this number is not valid!        

Sample Run 1      
7634 78KS     
Invalid Input!      

Sample Run 2      
7789!           
Invalid Input !         

Sample Run 3      
4539 1488 0343 6467     
DNumber:4_3_1_8_0_4_6_6_      
LNumber:8569247803833437      
Number is Valid     

Sample Run 4      
8273 1232 7352 0569     
DNumber:8_7_1_3_7_5_0_6_      
LNumber:7253226253120539      
Number is Invalid     

Sample Run 5      
42 123 4598       
DNumber:_2_2_4_9_     
LNumber:441438598   
Number is Invalid       

Sample Run 6      
3 89 23 1234      
DNumber:_8_2_1_3_     
LNumber:379432264   
Number is Valid     

# question_3

Write a program that takes an input letter and outputs it in a diamond shape. Given a letter, it prints a diamond starting with 'A', with the supplied letter at the    widest point.     

Your program should satisfy the following requirements:       
• The first row contains one 'A'.     
• The last row contains one 'A'.      
• All rows, except the first and last, have exactly two identical letters.    
• The diamond is horizontally symmetric.      
• The diamond is vertically symmetric.      
• The diamond has a square shape (width equals height).     
• The letters form a diamond shape.     
• The top half has the letters in ascending order.        
• The bottom half has the letters in descending order.      

In the following examples, spaces are indicated by character “.”.       

Example 1     
Diamond for letter 'A':     
A     

Example 2       
Diamond for letter 'C':       
..A..       
.B.B.       
C...C     
.B.B.     
..A..     

Example 3       
Diamond for letter 'E':       
....A....     
...B.B...     
..C...C..     
.D.....D.     
E.......E     
.D.....D.     
..C...C..     
...B.B...     
....A....     

-------------------------------------------------------   
Sample Run 1          
Enter a Letter: 7       
Invalid Input !       

Sample Run 2      
Enter a Letter: *     
Invalid Input !     

Sample Run 3      
Enter a Letter: A   
A     

Sample Run 4        
Enter a Letter: C     
..A..     
.B.B.     
C...C   
.B.B.     
..A..     

Sample Run 5        
Enter a Letter: AC      
Invalid Input !     
