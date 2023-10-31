insert into vocabularies (lesson_id, category, pinyin, chinese, english, vocabulary_order)
values (1, 'noun', 'Tàitǎnníkè hào', '泰坦尼克号', 'Titanic', 1);

insert into vocabularies (lesson_id, category, pinyin, chinese, english, vocabulary_order)
values (1, 'pronoun', 'zánmen', '咱们', 'we', 2);

insert into vocabularies (lesson_id, category, pinyin, chinese, english, vocabulary_order)
values (1, 'noun', 'hǎishuǐ', '海水', 'seawater', 3);

insert into vocabularies (lesson_id, category, pinyin, chinese, english, vocabulary_order)
values (1, 'noun', 'bīngchuān', '冰川', 'glacier (colloquially iceberg as well)', 4);

insert into vocabularies (lesson_id, category, pinyin, chinese, english, vocabulary_order)
values (1, 'noun', 'bīngshān', '冰山', 'iceberg', 5);

insert into vocabularies (lesson_id, category, pinyin, chinese, english, vocabulary_order)
values (1, 'measure word', 'zuò', '座', 'large geographic objects', 6);

insert into vocabularies (lesson_id, category, pinyin, chinese, english, vocabulary_order)
values (1, 'verb', 'táoshēng', '逃生', 'to escape with ones life', 7);

insert into vocabularies (lesson_id, category, pinyin, chinese, english, vocabulary_order)
values (1, 'noun', 'tóuděngcāng', '头等舱', 'first class', 8);

insert into vocabularies (lesson_id, category, pinyin, chinese, english, vocabulary_order)
values (1, 'noun', 'jiùshēngtǐng', '救生艇', 'lifeboat', 9);

insert into vocabularies (lesson_id, category, pinyin, chinese, english, vocabulary_order)
values (1, 'verb', 'guài', '怪', 'to blame', 10);

insert into vocabularies (lesson_id, category, pinyin, chinese, english, vocabulary_order)
values (1, 'noun', 'sānděngcāng', '三等舱', 'third class cabin', 11);

insert into vocabularies (lesson_id, category, pinyin, chinese, english, vocabulary_order)
values (1, 'verb', 'qiǎng', '抢', 'to rob', 12);

insert into vocabularies (lesson_id, category, pinyin, chinese, english, vocabulary_order)
values (1, 'verb', 'shènshuǐ', '渗水', 'to sink under water', 13);

insert into vocabularies (lesson_id, category, pinyin, chinese, english, vocabulary_order)
values (1, 'adjective', 'cì', '次', 'poor quality', 14);

insert into vocabularies (lesson_id, category, pinyin, chinese, english, vocabulary_order)
values (2, 'noun', 'Tàitǎnníkè hào', '泰坦尼克号', 'Titanic', 1);





INSERT INTO lessons(title, discussion, difficulty, thumbnail_url, audio_url)
VALUES ('Last Lesson', 'This is a discussion', 'BEGINNER', 'https://thumbnail.de', 'https://audiourl.com');

INSERT INTO lessons(title, discussion, difficulty, thumbnail_url, audio_url)
VALUES ('Let me do it, myself', 'One of the things we''re proud of at Popup Towers is our hard-fought ability to wring natural dialogues out of less-than-natural voice-actors, a skill that usually involves unleashing Grace at them in varying degrees of rage. And since recording a dialogue this way can take up a bit of time, the result is that we usually end up with a number of variants for each one, usually getting more and more natural as we go along. If you''re totally new to Chinese we suggest coming back to this show later -- the lesson is a bit tricky for the Absolute Beginner level -- but we wanted to showcase it here for two reasons. The first is that this show features not one but two dialogues. The interesting thing is that the first dialogue sounds a bit stilted while the second sounds extremely natural. And since they basically saying the same thing, we wanted to contrast and compare them, to learn what it is that makes mandarin sound forced and what makes it more colloquial.',
'BEGINNER', 'http://popupchinese.com/data/1449/image.jpg', 'audiourl');

INSERT INTO lessons(title, discussion, difficulty, thumbnail_url, audio_url)
VALUES ('Shattered Dreams', 'Rather than a regular podcast, today we are pleased to publish a longer Elementary dialogue designed to test your listening comprehension. The language used here is not terribly difficult, but it is spoken at native pace and with the sort of emotional inflection you''ll find living and working in China. So take a listen and click through to our quiz to see how much you understand. Our annotated transcript is there as always in case you have difficulty.',
'ELEMENTARY', 'http://popupchinese.com/data/1414/image.jpg', 'audiourl');




insert into dialogs (lesson_id, pinyin, chinese, english, speaker, dialog_order)
values (1, 'Nǐ hǎo', '你好', 'Hello!', '安吉', 1);

insert into dialogs (lesson_id, pinyin, chinese, english, speaker, dialog_order)
values (1, 'Zhè shì shéi', '这是谁', 'Who is it?', 'Shuo sun', 2);

insert into dialogs (lesson_id, pinyin, chinese, english, speaker, dialog_order)
values (1, 'Nǐ de lǎolao láile', '你的姥姥来了', 'Your grandmom is it', '安吉', 3);

insert into dialogs (lesson_id, pinyin, chinese, english, speaker, dialog_order)
values (1, 'Tā mā de', '他妈的', 'Damn!', 'Shuo sun', 4);




insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
1, 'Nǐ hǎo', '你好', 'Hello!', '安吉', 2
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
2, 'Zhè shì shéi', '这是谁', 'Who is it?', 'Shuo sun', 2
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
3, 'Nǐ de lǎolao láile', '你的姥姥来了', 'Your grandmom is it', '安吉', 2
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
4, 'Tā mā de', '他妈的', 'Damn!', 'Shuo sun', 2
);



insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
1, 'Nǐ hǎo', '你好', 'Hello!', '安吉', 3
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
2, 'Zhè shì shéi', '这是谁', 'Who is it?', 'Shuo sun', 3
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
3, 'Nǐ de lǎolao láile', '你的姥姥来了', 'Your grandmom is it', '安吉', 3
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
4, 'Tā mā de', '他妈的', 'Damn!', 'Shuo sun', 3
);





insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
1, 'Nǐ hǎo', '你好', 'Hello!', '安吉', 4
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
2, 'Zhè shì shéi', '这是谁', 'Who is it?', 'Shuo sun', 4
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
3, 'Nǐ de lǎolao láile', '你的姥姥来了', 'Your grandmom is it', '安吉', 4
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
4, 'Tā mā de', '他妈的', 'Damn!', 'Shuo sun', 4
);




insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
1, 'Nǐ hǎo', '你好', 'Hello!', '安吉', 5
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
2, 'Zhè shì shéi', '这是谁', 'Who is it?', 'Shuo sun', 5
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
3, 'Nǐ de lǎolao láile', '你的姥姥来了', 'Your grandmom is it', '安吉', 5
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
4, 'Tā mā de', '他妈的', 'Damn!', 'Shuo sun', 5
);





insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
1, 'Nǐ hǎo', '你好', 'Hello!', '安吉', 6
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
2, 'Zhè shì shéi', '这是谁', 'Who is it?', 'Shuo sun', 6
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
3, 'Nǐ de lǎolao láile', '你的姥姥来了', 'Your grandmom is it', '安吉', 6
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
4, 'Tā mā de', '他妈的', 'Damn!', 'Shuo sun', 6
);





insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
1, 'Nǐ hǎo', '你好', 'Hello!', '安吉', 7
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
2, 'Zhè shì shéi', '这是谁', 'Who is it?', 'Shuo sun', 7
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
3, 'Nǐ de lǎolao láile', '你的姥姥来了', 'Your grandmom is it', '安吉', 7
);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (
4, 'Tā mā de', '他妈的', 'Damn!', 'Shuo sun', 7
);






insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (1, 'Nǐ hǎo', '你好', 'Hello!', '安吉', 8);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (2, 'Zhè shì shéi', '这是谁', 'Who is it?', 'Shuo sun', 8);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (3, 'Nǐ de lǎolao láile', '你的姥姥来了', 'Your grandmom is it', '安吉', 8);

insert into dialogs (dialog_order, pinyin, chinese, english, speaker, lesson_id)
values (4, 'Tā mā de', '他妈的', 'Damn!', 'Shuo sun', 8);


