BEGIN TRANSACTION;

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');


INSERT INTO quotes (quote_text,quote_author) VALUES ('Success isn''t always about greatness. It''s about consistency. Consistent hard work leads to success. Greatness will come.', 'Dwayne Johnson');
INSERT INTO quotes (quote_text,quote_author) VALUES ('Luck? I don''t know anything about luck. Luck to me is something else: hard work and realizing what is opportunity and what isn''t.', 'Lucille Ball');
INSERT INTO quotes (quote_text,quote_author) VALUES ('Ambition is the path to success. Persistence is the vehicle you arrive in.','Bill Bradley');
INSERT INTO quotes (quote_text,quote_author) VALUES ('You keep putting one foot in front of the other, and one day you look back and you''ve climbed a mountain.', 'Tom Hiddleston');
INSERT INTO quotes (quote_text,quote_author) VALUES ('Keep a little fire burning, however small, however hidden.', 'Cormac McCarthy');
INSERT INTO quotes (quote_text,quote_author) VALUES ('We are what we repeatedly do. Excellence, then, is not an act but a habit.', 'Aristotle');
INSERT INTO quotes (quote_text,quote_author) VALUES ('Hang onto your hat, hang onto your hope and wind the clock, for tomorrow is another day.', 'E.B. White');
INSERT INTO quotes (quote_text,quote_author) VALUES ('The gem cannot be polished without friction, nor man perfected without trials.','Chinese proverb');
INSERT INTO quotes (quote_text,quote_author) VALUES ('You cannot change your destination overnight, but you can change your direction overnight.', 'Jim Rohn');
INSERT INTO quotes (quote_text,quote_author) VALUES('If everybody is doing it one way, there''s a good chance you can find your niche by going exactly in the opposite direction.', 'Sam Walton');
INSERT INTO quotes (quote_text,quote_author) VALUES ('You''ve got to think about the big things while you''re doing the small things so that all the small things go in the right direction.', 'Alvin Toffler');
INSERT INTO quotes (quote_text,quote_author) VALUES ( 'Success is often the result of taking a misstep in the right direction.','Al Bernstein');
INSERT INTO quotes (quote_text,quote_author) VALUES('If you hear a voice within you say, ''You cannot paint,'' then by all means paint, and that voice will be silenced.','Vincent van Gogh');
INSERT INTO quotes (quote_text,quote_author) VALUES ('To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment.','Ralph Waldo Emerson');
INSERT INTO quotes (quote_text,quote_author) VALUES ('If opportunity doesn''t knock, build a door.','Milton Berle');
INSERT INTO quotes (quote_text,quote_author) VALUES ('Striving for success without hard work is like trying to harvest where you haven’t planted.','David Bly');
INSERT INTO quotes (quote_text,quote_author) VALUES ('Sometimes when you''re in a dark place you think you''ve been buried, but you''ve actually been planted.','Christine Caine');
INSERT INTO quotes (quote_text,quote_author) VALUES ('A pessimist sees the difficulty in every opportunity; an optimist sees the opportunity in every difficulty.', 'Winston S. Churchill');
INSERT INTO quotes (quote_text,quote_author) VALUES ('Courage starts with showing up and letting ourselves be seen.', 'Brene Brown');
INSERT INTO quotes (quote_text,quote_author) VALUES ('The voyage of discovery is not in looking for new landscapes, but in looking with new eyes.','Anonymous');
INSERT INTO quotes (quote_text,quote_author) VALUES ('Only those who dare to fail greatly can ever achieve greatly.', 'Robert F. Kennedy');
INSERT INTO quotes (quote_text,quote_author) VALUES ('All of the darkness of the world cannot put out the light of one small candle.','Anonymous');
INSERT INTO quotes (quote_text,quote_author) VALUES ('If one advances confidently in the direction of his dreams,and endeavors to live the life which he has imagined,he will meet with a success unexpected in common hours.','Henry David Thoreau');
INSERT INTO quotes (quote_text,quote_author) VALUES ('Excellence is to do a common thing in an uncommon way.','Booker T. Washington');
INSERT INTO quotes (quote_text,quote_author) VALUES ('Don’t be afraid to go out on a limb. That’s where the fruit is.', 'H. Jackson Browne');
INSERT INTO quotes (quote_text,quote_author) VALUES ('Don''t be afraid to fail. Don''t waste energy trying to cover up failure. Learn from your failures and go on to the next challenge. It''s OK to fail. If you''re not failing, you''re not growing.','H. Stanley Judd');
INSERT INTO quotes (quote_text,quote_author) VALUES ('Opportunities don''t often come along. So, when they do, you have to grab them.','Audrey Hepburn');
INSERT INTO quotes (quote_text,quote_author) VALUES ('When one door closes, another opens; but we often look so long and so regretfully upon the closed door that we do not see the one which has opened for us.', 'Alexander Graham Bell');
INSERT INTO quotes (quote_text,quote_author) VALUES ('Never tell me the sky’s the limit when there are footprints on the moon.','Author Unknown');
INSERT INTO quotes (quote_text,quote_author) VALUES ('Every experience in your life is being orchestrated to teach you something you need to know to move forward.', 'Brian Tracy');

INSERT INTO bot_test_messages (message_text) VALUES ('this is test data');




COMMIT TRANSACTION;
