# RestaurantBilling

# Restaurant-spring

1. Run Restaurent.sql in Restaurant-spring folder

2. Change Database username and Password in application.properties

3. I have Documented my REST api calls using postman and published https://documenter.getpostman.com/view/17079993/Tzz8qbtC refer this link for using application.

4. I have added crossjoines for angular and react ports.

# Restaurant-admin(Angular)

1. install all the dependency needed for angular from package.json using command npm install

2. Run application by command ng serve or npm start

3. goto http://localhost:4200/ you will see a login page of admin

4.  use this to login 

    | Admin Id | Admin Name | password |
    | :---: | :---: | :---: |
    | 101 | Saikiran | Saikiran |

5. Press Login again if u not redirect to home page.

6. In Home page U will see Options for 
    - Todays Bills: will get all Today generated bills and orders
    - This Month Bills : will show all the This Month Bills
    - User Options : Refer Step 7 for User operations.
    - Logout : Logout from application
7. When you click User Operations It will have Below options.
    - Home : will Goto Home page
    - Get Users: It will give u all the Users when u wanted to Delete User u can click on Delete Button at right side of user Details
    - Add user : It will ask for userid,User name,User password which u wanted for user and click creat account it will created.

# Restaurant-user(React)

1. install all the dependency needed for react from package.json using npm install command

2. Run application by command npm run start

3. goto http://localhost:3000/ you will see a login page of user.

4. use this for login or creat a account by clicking Register Button. and than click login to login useing account u have created

    | Admin Id | Admin Name | password |
    | :---: | :---: | :---: |
    | 301 | Sai | Sai |
    | 302 | Anmol | Anmol |
    | 303 | Pallavi | Pallavi |

5. After login you will see a Menu and a navbar with options
    - Order 
        - you will have input boxes for order of items
        - give Item id in Item Input box and Quantity you wanted to buy 
        - Click add to cart. You can add multiple items into cart by clicking add to cart button
        - after completion Orders click Generate Bill which will show your bill.
    - Get your Bill : will show the ordered items and prices
    - Logout : will logout from application.
  



