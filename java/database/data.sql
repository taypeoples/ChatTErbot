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

INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('Keyword not found message','<p>Sorry, I''m not sure how to help you, please type your response again or type a command from below to let me know what I should do.</p>','help','default','default');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('Assistance message','You can type another command from below, or if you''re stuck you can reach out to an instructor or pathway director for additional help','help','assistance','default');


INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('First message','<p>I can help you with:</p><ul><li>Pathway information</li><li>Curriculum</li><li>Get a motivational quote</li>Which would you like help with?','default','default','default');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('First pathway message','<p>I can help you with your Resume, a Cover Letter, or Interview Prep.<br>What would you like to talk about?</p>','pathway','default','default');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('pathway/resume main','I can break down the main parts of a resume or provide you with links to examples of resumes. Which would you like?','pathway','resume','default');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('pathway/interview main','I can help you with Interview Prep, following up with employers, what to wear to interviews, or common STAR questions. Which would you like help with?','pathway','interview','default');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('pathway/interview prep','<p>Here are some tips to help you prepare for an interview:</p><ul><li>Familiarize yourself with the company and representative you will be interviewing with.</li><li>Practice common questions for the field prior to the interview.</li><li>Ensure you get a good night''s sleep the night before.</li></ul>','pathway','interview','prep');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('pathway/follow up','<p>Here are some tips for following up with an employer after an interview:</p><ul><li>Send a thank you note to all parties present at the interview within 24 hours.</li><li>Set a reminder to follow up again with a potential employer/recruiter in a week</li><li>If you have a follow-up interview, make sure you continue to prep for it.</li></ul>','pathway','interview','follow');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('pathway/cover main','I can show you the components of a cover letter or examples of a cover letter. Which would you like?','pathway','cover','default');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('pathway/cover parts','<p>The main parts of a cover letter are as follows:</p><ul><li>Personal Information</li><li>Receiving Party Info</li><li>Salutation</li><li>Letter Body</li><li>Closing</li></ul>','pathway','cover','parts');

INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('pathway/resume parts','<p>Here are the main parts of a technical resume:</p><ul><li>Name & Contact Information</li><li>Professional Summary</li><li>Technical Skills</li><li>Technical Experience</li><li>Education</li><li>Professional Experience</li></ul><p>If you would like a template you can find one at this link!</p> <p><a href="https://careerservices.fas.harvard.edu/resources/bullet-point-resume-template">Resume Template</a></p>','pathway', 'resume','parts');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('pathway/resume links','<p>Here are a few example resumes!</p><p><a href="https://edu.gcfglobal.org/en/resumewriting/gallery-of-sample-resumes/1/#">Sample Resumes</a></p>','pathway','resume','links');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('pathway/interview outfit','<p>Here are some links to help you understand what is appropriate dress for an interview!</p><p><a href="https://www.coursera.org/articles/what-to-wear-to-an-interview">Interview Outfits</a></li></ul>','pathway','interview','outfit');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('pathway/interview star','<p>Here is a list of common STAR questions:</p><p><a href="https://www.themuse.com/advice/behavioral-interview-questions-answers-examples">Common Behavioral Interview Questions</a></p><p>This page includes a form to help you brainstorm and keep track of your STAR responses!</p><p><a href="https://docs.google.com/spreadsheets/d/1bDueF61fW5FNTbJNIhkmmA2U5LqIpI1j1IoEmtrxfJc/copy">Sample Resumes</a></p>','pathway','interview','star');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('pathway/cover examples','<p>Here are a few example cover letters!</p><a href="https://novoresume.com/career-blog/cover-letter-examples">Cover Letter Examples</a></p>','pathway','cover','links');

INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('First Curriculum Message', '<p>In regards to curriculum, I can help you with these topics:</p><ul><li>Java programming</li><li>Client-Server Programming</li><li>Web Application Development</li><li>Databases</li></ul><p>Which of these would you like to explore?</p>', 'curriculum', 'default', 'default');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/java', '<p>For Java, I can help you with: </p><ul><li>Variables</li><li>Arrays</li><li>Collections</li><li>Unit testing</li><li>Object-Oriented Programming (OOP)</li></ul>', 'curriculum', 'java', 'default');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/java/variables', 'If you need help with variables and data types, please refer to the BootcampOS section in Intro to Programming in Java titled Variables and data types', 'curriculum', 'java', 'variables');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/java/collections', 'To understand collections better you can view the BootcampOS section Intro to Programming in Java titled Collections - Part 1 & 2', 'curriculum', 'java', 'collections');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/clientserver', 'For Client-Server, I can help you with Server-side APIs, DAOs, Networking. Which of these would you like to know more about?', 'curriculum', 'clientserver', 'default');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/clientserver/dao', 'If you want more information on DAOs, you can look to the Data Access and DAO section within the Client-Server Programming in Java module', 'curriculum', 'clientserver', 'dao');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/webapp', '<p>For Web Application Development, I can help you with: </p><ul><li> CSS</li><li>HTML</li><li>Javascript</li><li>Vue</li></ul><p> Please let me know which of these topics you would like to know more about.</p>', 'curriculum', 'webapp', 'default');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/webapp/javascript', 'It might be a good idea to check the BootcampOS module Web Application Development where you can find the section called Intro to Javascript.', 'curriculum', 'webapp', 'javascript');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/clientserver/dao', 'If you want more information on DAOs, you can look to the Data Access and DAO section within the Client-Server Programming in Java module', 'curriculum', 'clientserver', 'dao');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/databases', '<p>For Databases, I can help you with  SQL, Database Design, or Data Security.</p><p> Which of these topics would you like help with?</p>', 'curriculum', 'databases', 'default');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/databases/sql', '<p>In the BootcampOS module, Client-Server Programming in Java, there are a handful of modules that can help with SQL.</p><p> I would start with the Intro to Databases section, then you can look at: Ordering, Limiting, and Grouping or SQL joins or Insert, Update and Delete depending on what you need help with</p>', 'curriculum', 'databases', 'sql');

INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/java/arrays','<p>For more information on arrays outside of the reading and lecture, you can view this page:</p><p><a href="https://www.javatpoint.com/array-in-java">Java Arrays</a></p>','curriculum','java','arrays');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/java/unittesting','<p>This page helps break down how to set up unit testing in Java:</p><p><a href="https://www.baeldung.com/java-unit-testing-best-practices">Unit Testing</a></p>','curriculum', 'java','unittesting');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/java/oop','<p>This video is a great explanation on how Object-Oriented Programming works:</p><p><a href="https://www.youtube.com/watch?v=pTB0EiLXUC8a">OOP Video</a></p>','curriculum', 'java','oop');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/clientserver/api','<p>In order to help understand how APIs work, this video will expain Restful APIs:</p><p><a href="https://www.youtube.com/watch?v=lsMQRaeKNDk">Restful APIs video</a></p>','curriculum', 'clientserver','api');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/clientserver/networking','<p>This Mozilla page on HTTP is a useful site with lots of additional resources to help you understand networking in the client-server model</p><p><a href="https://developer.mozilla.org/en-US/docs/Web/HTTP">HTTP information</a></p>','curriculum', 'clientserver','networking');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/webapp/css','<p>Mozilla has a very nice page on how to start out with CSS that expands to many specific topics. I hope this link helps: </p><p><a href="https://developer.mozilla.org/en-US/docs/Learn/CSS">CSS information</a></p>','curriculum', 'webapp','css');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/webapp/htmls','<p>This video gives a good basic overview of what HTML if you would like to go beyond the reading and lecture:</p> <p><a href="https://www.youtube.com/watch?v=salY_Sm6mv4">Basics of HTML video</a></p>','curriculum', 'webapp','html');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/webapp/vue','<p>The Vue.js website is a very helpful resource for all things related to Vue.js. I recommend bookmarking this link: </p> <p><a href="https://vuejs.org/guide/introduction.html">Intro to Vue.js</a></p>','curriculum', 'webapp','vue');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/databases/databasedesign','<p>Not only is Lucidchart is a great tool to play around with for helping visualize databases but this page is also a great in depth resource on Database Structure and Design</p> <p><a href="https://www.lucidchart.com/pages/database-diagram/database-design">Lucidcharts Database Design Information</a></p>','curriculum', 'databases','databasedesign');
INSERT INTO response (response_description, response_text, need_category, keyword_1, keyword_2) VALUES ('curriculum/databases/datasecurity','<p>For more information beyond the lecture and reading this link gives you a more in depth explanation of some of the topics you have or will cover: </p> <p><a href="https://satoricyber.com/sql-server-security/sql-server-security/">SQL Server Security</a></p>','curriculum', 'databases','datasecurity');



COMMIT TRANSACTION;
