BEGIN TRANSACTION;

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');


INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"Success isn''t always about greatness. It''s about consistency. Consistent hard work leads to success. Greatness will come."</em></p>', '-Dwayne Johnson');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"Luck? I don''t know anything about luck. Luck to me is something else: hard work and realizing what is opportunity and what isn''t."</em></p>', '-Lucille Ball');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"Ambition is the path to success. Persistence is the vehicle you arrive in."</em></p>','-Bill Bradley');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"You keep putting one foot in front of the other, and one day you look back and you''ve climbed a mountain."</em></p>', '-Tom Hiddleston');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"Keep a little fire burning, however small, however hidden."</em></p>', '-Cormac McCarthy');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"We are what we repeatedly do. Excellence, then, is not an act but a habit."</em></p>', '-Aristotle');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"Hang onto your hat, hang onto your hope and wind the clock, for tomorrow is another day."</em></p>', '-E.B. White');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"The gem cannot be polished without friction, nor man perfected without trials."</em></p>','-Chinese proverb');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"You cannot change your destination overnight, but you can change your direction overnight."</em></p>', '-Jim Rohn');
INSERT INTO quotes (quote_text,quote_author) VALUES('<p><em>"If everybody is doing it one way, there''s a good chance you can find your niche by going exactly in the opposite direction."</em></p>', '-Sam Walton');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"You''ve got to think about the big things while you''re doing the small things so that all the small things go in the right direction."</em></p>', '-Alvin Toffler');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"Success is often the result of taking a misstep in the right direction."</em></p>','-Al Bernstein');
INSERT INTO quotes (quote_text,quote_author) VALUES('<p><em>"If you hear a voice within you say, ''You cannot paint,'' then by all means paint, and that voice will be silenced."</em></p>','-Vincent van Gogh');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment."</em></p>','-Ralph Waldo Emerson');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"If opportunity doesn''t knock, build a door."</em></p>','-Milton Berle');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"Striving for success without hard work is like trying to harvest where you haven’t planted."</em></p>','-David Bly');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"Sometimes when you''re in a dark place you think you''ve been buried, but you''ve actually been planted."</em></p>','-Christine Caine');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"A pessimist sees the difficulty in every opportunity; an optimist sees the opportunity in every difficulty."</em></p>', '-Winston S. Churchill');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"Courage starts with showing up and letting ourselves be seen."</em></p>', '-Brene Brown');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"The voyage of discovery is not in looking for new landscapes, but in looking with new eyes."</em></p>','-Anonymous');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"Only those who dare to fail greatly can ever achieve greatly."</em></p>', '-Robert F. Kennedy');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"All of the darkness of the world cannot put out the light of one small candle."</em></p>','-Anonymous');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"If one advances confidently in the direction of his dreams,and endeavors to live the life which he has imagined,he will meet with a success unexpected in common hours."</em></p>','-Henry David Thoreau');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"Excellence is to do a common thing in an uncommon way."</em></p>','-Booker T. Washington');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"Don’t be afraid to go out on a limb. That’s where the fruit is."</em></p>', '-H. Jackson Browne');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"Don''t be afraid to fail. Don''t waste energy trying to cover up failure. Learn from your failures and go on to the next challenge. It''s OK to fail. If you''re not failing, you''re not growing."</em></p>','-H. Stanley Judd');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"Opportunities don''t often come along. So, when they do, you have to grab them."</em></p>','-Audrey Hepburn');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"When one door closes, another opens; but we often look so long and so regretfully upon the closed door that we do not see the one which has opened for us."</em></p>', '-Alexander Graham Bell');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"Never tell me the sky’s the limit when there are footprints on the moon."</em></p>','-Author Unknown');
INSERT INTO quotes (quote_text,quote_author) VALUES ('<p><em>"Every experience in your life is being orchestrated to teach you something you need to know to move forward."</em></p>', '-Brian Tracy');

INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('Keyword not found message','<p>Sorry, I''m not sure how to help you, please type your response again or type a command from below to let me know what I should do.</p>','help','default');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('Assistance message','You can type another command from below, or if you''re stuck you can reach out to an instructor or pathway director for additional help','assistance','default');

INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('First message','<p>Hello! I am ChatTEr Bot, your cohort companion. <br>What can I help you with, </p>','main','default');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('First pathway message','<p>I can help you with your Resume, a Cover Letter, or Interview Prep. What would you like to talk about?</p>','pathway','default');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/resume main','<p>Your resume is a crucial part of your job search, the silent representation of you and your skills. I can break down the main components of a resume or provide you with links to examples of resumes. What would would you like?</p>','resume','default');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/resume parts','<p>Here are the main parts of a  technical resume: <ul><li>Name & Contact Information:</li><li>Professional Summary:</li><li>Technical Skills:</li><li>Technical Experience:</li><li>Education:</li><li>Professional Experience:</li></ul><br>If you would like a template you can find one at this link! </p><p><a href="https://edu.gcfglobal.org/en/resumewriting/gallery-of-sample-resumes/1/" target="_blank">Templates</a></p>','resume','parts');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/resume links','<p>Here are a few example resumes! </p><p><a href=""https://edu.gcfglobal.org/en/resumewriting/gallery-of-sample-resumes/1/#"" target="_blank">Example Resume</a></p>','resume','links');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/interview main','<p>Interviews don''t have to be scary, there are so many ways you can prepare! I can help you with Interview Prep, following up with employers, what to wear to interviews, or common STAR questions. Which would you like help with? </p>','interview','default');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/interview prep','<p>Here are some tips to help you prepare for an interview!<ul><li>Familiarize yourself with the company and representative you will be interviewing with.</li><li>Practice common questions for the field prior to the interview.</li><li>Ensure you get a good night''s sleep the night before</li></ul></p>','interview','prep');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/follow up','<p>Here are some tips for following up with an employer after an interview: Send a thank you note to all parties present at the interview within 24 hours. If they ask you to put in an application or send them additional information ensure you do that as quickly as possible! Stay a warm contact, this may mean reaching out just to check in with them or ask about something that you had previously spoken about! </p>','interview','follow');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/interview outfit','<p>Here are some links to help you understand what is appropriate dress for an interview! </p> <p><a href="https://www.coursera.org/articles/what-to-wear-to-an-interview" target="_blank"> How To Dress</a></p>','interview','outfit');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/interview star','<p>Here is a list of common STAR questions:</p><p><a href=""https://www.themuse.com/advice/behavioral-interview-questions-answers-examples"" target=""_blank"">Common Behavioral Interview Questions</a></p><p>This page includes a form to help you brainstorm and keep track of your STAR responses!</p><p><a href=""https://docs.google.com/spreadsheets/d/1bDueF61fW5FNTbJNIhkmmA2U5LqIpI1j1IoEmtrxfJc/copy"">Sample questions</a></p><p>Practice these ahead of time!</p>','interview','star');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/cover main','<p>A cover letter is much less common these days, but if one is requested make sure you send one! I can show you the components of a cover letter or examples of a cover letter. Which would you like? </p>','cover','default');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/cover parts','<p>The main parts of a cover letter are as follows: <ul><li>Personal Information:</li><li>Receiving Party Info: </li><li>Salutation:</li><li>Letter Body: </li><li>Closing: </li></ul></p>','cover','parts');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/cover examples','<p>Here are a few example cover letters! </p> <p><a href="https://novoresume.com/career-blog/cover-letter-examples" target="_blank"> Examples </a></p>','cover','links');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/socialmedia','<p>Social media can be a great tool for networking during your job search, in TE we generally use Huntr and LinkedIn. Let me know if you tips for either of these platforms! </p>','social','default');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/socialmedia/linkedin','<p>Here is a great video with tips and tricks for LinkedIn: </p> <p><a href="https://www.youtube.com/watch?v=X3OzK2w8kUs" target="_blank"> LinkedIn Tips</a></p>','social','link');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/socialmedia/huntr','<p>Here is a great video with tips and tricks for Huntr: </p> <p><a href="https://www.youtube.com/watch?v=QtcM5BsnWfM" target="_blank">Huntr Tips</a></p>','social','hunt');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/technicalinterview/explanation','<p>Technical interviews involve challenges and assignments. They are more similar to an exam than a typical question-and-answer- interview. Like the phrase “Show, don’t tell,” you have to prove that you have the skills required to do the job, rather than just tell the interviewer that you have them.Contrary to popular belief, the purpose of the technical interview is not to trick you with riddles, brain teasers, or impossible questions. Instead, it’s to see how you tackle real-world problems–like the ones you might be facing once you have the job! </p>','technical','explanation');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/technicalinterview/prep','<p>While a technical interview may seem scary its no worries. Just take the time to prepare and read over your materials for the job. You should always practice these things beforehand so you can be prepared. Here is a great site for tips before, during, and after the interview!  </p> <p><a href="https://learntocodewith.me/posts/technical-interview/" target="_blank"> Tech Interview Tips</a></p>','technical','prep');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/netowrking/default','<p>Networking is when you are making new connections, building existing relationships, engaging in active conversation and listening so that you can leverage these relationships to find new opportunities in the industry or find mentorship and receive career advice. When it comes to networking I can help with advice on how to find events and for preparing for an event. <br>What would you like to talk about?  </p>','networking','default');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/netowrking/prep','<p>Before you go to a networking event it would be good to consider how you present yourself. This is includes dressing your best, considering how you would like to introduce yourself, and having your elevator pitch ready and practiced. You will also want to come prepared with some thoughtful questions for the people you meet and be prepared to actively listen. Additionally, make sure you follow up with the people you meet on LinkedIn or by e-mail if you received their contact information. </p>','networking','prep');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/netowrking/events','<p>You can network anywhere and anytime, but there are places that are more conducive to effective networking. There may be local or virtual events that you can find on MeetUp, there are many different conferences that you can find, or even join a slack channel that posts networking events. </p>','networking','events');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/matchmaking/default','<p>I can give you an overview of the matchmaking program at Tech Elevator and how to prepare for the day of, which would you like to talk about? </p>','matchmaking','default');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/matchmaking/overview','<p>Matchmaking at Tech Elevator is a series of interviews that are facilitated by Tech Elevator to get you on the radar of prospective tech employers. Before matchmaking you generally indicate which companies that will be in attendance that you are interested in and based on all students input assignments will be made. These are short interviews that are normally more like a phone screening but may hold a few technical questions as well. </p>','matchmaking','overview');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('pathway/matchmaking/prep','<p>Before matchmaking, ensure that you have located when and where your interview will be occurring, research the company that you will be interviewing with, and prepare questions for you to ask those you are interviewing.<br><br>On matchmaking day, make sure that you dress to impress, ensure you are on time, have a notebook and a writing utensil at the ready. You will want to arrive around five minutes early. If you are virtual make sure that your background is clear of clutter and that you have good lighting. <br><br>After matchmaking make sure you thank your interviews with a formal thank you e-mail or message within 24 hours and follow up after a week if you intend on pursuing a position with this company. </p>','matchmaking','prep');

INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('First Curriculum Message', '<p>In regards to curriculum, I can help you with these topics:</p><ul><li>Java programming</li><li>Client-Server Programming</li><li>Web Application Development</li><li>Databases</li><li>Front End Development</li></ul><p>Which of these would you like to explore?</p>', 'curriculum', 'default');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/java', '<p>Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. For Java, I can help you with variables, arrays, collections, unit testing, Object-Oriented Programming (OOP),Classes and encapsulation.</p>', 'java', 'default');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/java/variables', '<p>Variables are containers for storing data values. In Java, there are different types of variables, for example: String - stores text, such as "Hello". String values are surrounded by double quotes. int - stores integers (whole numbers), without decimals, such as 123 or -123. If you need help with variables and data types, please refer to the BootcampOS section in Intro to Programming in Java titled Variables and data types. or follow the link to get more information on variables and how they work.</p><p><a href="https://www.youtube.com/watch?v=N8LDSryePuc&t=1s" target="_blank">Variables</a></p>', 'java', 'variables');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/java/arrays', '<p>Arrays are a container that contains a set amount of items of a specific data type. For more information on arrays outside of the reading and lecture, you can view this page:</p><p><a href="https://www.javatpoint.com/array-in-java" target="_blank">Arrays</a></p>', 'java', 'arrays');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/java/collections', '<p>There are many different types of collections in Java. Some of these are Array Lists, Maps, Stacks, and Queues .To understand collections better you can view the BootcampOS section Intro to Programming in Java titled Collections - Part 1 & 2</p><p><a href="https://www.youtube.com/watch?v=viTHc_4XfCA" target="_blank">Collections</a></p>', 'java', 'collections');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/java/unittesting', '<p>Unit Testing is a great way to ensure your code is working intended. Essentially you have tests that will call the methods or blocks of code that you have created and you will compare them against an expected result. If they match, the test passes. Otherwise the test fails and you know you may have some sort of error in your code! This page helps break down how to set up unit testing in Java:</p><p><a href="https://www.baeldung.com/java-unit-testing-best-practices" target="_blank">Unit Testing</a></p>', 'java', 'unit');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/java/oop', '<p>Java is an Object Oriented Programming language. This means that most Java programs are built up of classes that utilize the concepts of Encapsulation, Inheritance, and Polymorphism. You can ask me about these concepts as well! This video is a great explanation on how Object-Oriented Programming works:</p><p><a href="https://www.youtube.com/watch?v=pTB0EiLXUC8" target="_blank">Object Oriented Programming</a></p>', 'java', 'oop');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/java/inheritance', '<p>Inheritance is the act of having one class adopt the properties and methods of another class. This prevents code duplication and allows you to share code across classes while having the source code live in only one class file. The class that is being inherited from is called a parent or super class, and the class on the receiving end is called a sub or child class.</p>', 'java', 'inheritance');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/java/polymorphism', '<p>The word polymorphism, derived from the Greek language, means "the ability to have multiple forms." <br><br>In object-oriented programming, polymorphism is the idea that something can be assigned a different meaning or usage based on its context. This specifically allows variables and objects to take on more than one form. For example, if we have a super class of motor vehicles, there can be children of cars and boats. A boat is a motor vehicle but a bot is not a car.</p>', 'java', 'polymorphism');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/java/exceptions', '<p>Exceptions occur when during runtime an expected value comes in an unexpected way. This may be when you are asking for an integer to go into a method but you are instead provided with a string. This will cause the program to crash and a negative user experience. That is why exception handling is so important, it makes it so that instead of crashing when a exception is thrown it executes code that will keep the program running. You can find more info and how to use a try catch block at this link:</p><p><a target="_blank" href="https://www.w3schools.com/java/java_try_catch.asp">Exception Handling</a></p>', 'java', 'exceptions');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('"curriculum/java/classes and encapsulation"', '<p>If you need help to learn how to combine data behavior by creating new classes to use in your programs,  please refer to the BootcampOS section  in Intro to Programming in Java tittled classes and encapsulation or follow the link to learn more:</p><p><a target="_blank" href="https://www.youtube.com/watch?v=QFl9HhrpRFA"> Encapsulation</a></p>', 'java', 'encapsulation');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/clientserver', '<p>For Client-Server, I can help you with Server-side APIs, DAOs, Networking. Which of these would you like to know more about?</p>', 'clientserver', 'default');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/clientserver/api', '<p>API''s are an incredibly useful and powerful tool. They re tough to describe in a single message so check out this video instead:</p><p><a href="https://www.youtube.com/watch?v=lsMQRaeKNDk" target="_blank">Rest Api</a></p>', 'clientserver', 'api');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/clientserver/dao', '<p>DAO''s (Data Access Objects) are model objects that help you interact with outside dependencies. If you want more information on DAOs, you can look to the Data Access and DAO section within the Client-Server Programming in Java module or click on the link to get more information about DAOs:</p><p><a href="https://www.youtube.com/watch?v=ui01Li4vqDc" target="_blank">DAO Pattern</a></p>', 'clientserver', 'dao');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/clientserver/daotesting', '<p>When testing our DAO''s we will be doing integration testing. Integration testing can follow a similar pattern to unit testing, where we would still follow that Arrange, Act, Assert method, but we are now bringing in the external dependency of a database. The easiest way to test these DAO are to create mock data to test off of, but at times you may have to test off of your actual database. You will be most often comparing the result of calling your DAO method to what you would expect as it may be creating, updating, or deleting data.</p>', 'clientserver', 'daotesting');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/clientserver/networking', '<p>Hypertext Transfer Protocol (HTTP) is an application-layer protocol for transmitting hypermedia documents, such as HTML. It was designed for communication between web browsers and web servers, but it can also be used for other purposes. This Mozilla page on HTTP is a useful site with lots of additional resources to help you understand networking in the client-server model:</p><p><a target="_blank" href="https://developer.mozilla.org/en-US/docs/Web/HTTP"></a> Networking</p>', 'clientserver', 'http');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/webapp', '<p>For Web Application Development, I can help you with CSS, HTML, Javascript, and Vue. Please let me know which of these topics you would like to know more about.</p>', 'web', 'default');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/webapp/html', '<p>HTML is the skeletal structure of our web pages. This video gives a great basic overview of what HTML: </p><p><a href="https://www.youtube.com/watch?v=salY_Sm6mv4" target="_blank">HTML</a></p>', 'web', 'html');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/webapp/javascript', '<p>JavaScript is a loosely typed coding language that is most often used in front end applications (however it can be used on the back end as well). It might be a good idea to check the BootcampOS module Web Application Development where you can find the section called Intro to Javascript or follow the link below to learn more about JavaScript:</p><p><a href="https://www.youtube.com/watch?v=W6NZfCO5SIk" target="_blank">JavaScript</a></p>', 'web', 'javascript');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/webapp/vue', '<p>Vue.js is a framework that marries HTML, JavaScript, and CSS into a single component that can be dynamically displayed across many different pages of a website. The Vue.js website is a very helpful resource for all things related to Vue.js. I recommend bookmarking this link: </p><p><a href="https://vuejs.org/guide/introduction.html" target="_blank">Vue.js</a></p>', 'web', 'vue');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/databases', '<p>Databases are great for persistent storage of data. For Databases, I can help you with SQL, Database Design, or Data Security. Which of these topics would you like help with?</p>', 'database', 'default');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/databases/sql', '<p>In the BootcampOS module, Client-Server Programming in Java, there are a handful of modules that can help with SQL. I would start with the Intro to Databases section, then you can look at: Ordering, Limiting, and Grouping or SQL joins or Insert, Update and Delete depending on what you need help with. You can also look at the link provided for more on SQL.</p><p><a href="https://www.youtube.com/watch?v=h0nxCDiD-zg" target="_blank">SQL</a></p>', 'database', 'sql');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/databases/databasedesign', '<p>Database design is tough! Lucidchart is a great tool to play around with for helping visualize databases but this page is also a great in depth resource on Database Structure and Design:</p><p><a href="https://www.lucidchart.com/pages/database-diagram/database-design" target="_blank">Database Design</a></p>', 'database', 'design');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('curriculum/databases/datasecurity', '<p>Keep your databases secure! For more information beyond the lecture and reading, this link gives you a more in depth explanation of some of the topics you have or will cover: </p><p><a href="https://satoricyber.com/sql-server-security/sql-server-security/" target="_blank">Database Security</a></p>', 'database', 'security');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('cirriculum/frontend/tags', '<p> If you need help to learn how to combine data behavior by creating new classes to use in your programs, please refer to the Bootcamp OS section in Intro to Programming in Java titled classes and encapsulation or follow the link to learn more:</p> <p><a href=""https://www.youtube.com/watch?v=QFl9HhrpRFA"" target="_blank" target=""_blank"">Encapsulation in Java</a></p></p>', 'frontend', 'default');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('cirriculum/frontend/tags', '<p>There are many HTML tags that you will frequently use, here is a link to a helpful reference resource:</p><p><a href = “https://www.w3schools.com/tags/” target="_blank"> HTML Tags</a></p>', 'frontend', 'tags');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('cirriculum/frontend/CSS', '<p>Cascading Style Sheets (CSS) brings your web pages to life with layout and style. CSS is a style sheet language used for describing the presentation of a document written in a markup language like HTML. There are hundreds of different ways to style your page. Follow the link to see some examples of what you can do. </p><p><a href = ""https://www.w3schools.com/css/default.asp"" target=""_blank"">CSS Tutorial</a></p>', 'frontend', 'css');
INSERT INTO response (response_description, response_text, keyword_1, keyword_2) VALUES ('cirriculum/frontend/flexbox', '<p>Flexbox is short for Flexible Box Module. It''s a relatively new layout tool in CSS that provides a flexible way to arrange items on a page. Since its introduction several years ago, it has been steadily working its way into common usage in web development and is supported by nearly 98% of the available browsers.</p><p>Flexbox dynamically handles alignment and the space between page items, which helps to save time. It consists of a flex container that contains one or more flex items which are constrained in their layout within the container using various flexbox properties specified by the developer. The CSS Flexbox module in BOS is a great place to start.</p>', 'frontend', 'flex');



COMMIT TRANSACTION;
