package com.example.storykids;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import java.util.ArrayList;

public class StoryList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_list);

        final ArrayList<Story> stories = new ArrayList<>();
       stories.add(new Story(R.drawable.ant_dove, R.raw.ant, "The Ant & The Dove", "        A Dove saw an Ant fall into a brook. The Ant struggled in vain to reach the bank and in pity the Dove dropped a blade of straw close beside it. Clinging to the straw like a shipwrecked sailor to a broken spar the Ant floated safely to shore. Soon after the Ant saw a man getting ready to kill the Dove with a stone. But just as he cast the stone the Ant stung him in the heel so that the pain made him miss his aim and the startled Dove flew to safety in a distant wood.\n" +
               "\n"));
        stories.add(new Story(R.drawable.hare_tortoise, R.raw.turtle, "The Hare and the Tortoise", "‘Look at me!’ said the Hare to the other animals. ‘Just look how fast I can run.’\n" +
                "                    The Hare ran across a field as fast as he could. All the animals agreed that yes the Hare was very fast.\n" +
                "                    The Hare ran back. ‘See,’ he shouted. ‘I’m not even out of breath.’\n" +
                "                    ‘Yeah, that was fast,’ said the Fox.\n" +
                "                    ‘So who wants a race?’ said the Hare. ‘Anybody think they could beat me?’\n" +
                "                    None of the animals spoke.\n" +
                "                    ‘See,’ said the Hare. ‘You’re all too scared to even try.’\n" +
                "                    ‘I’ll have a go,’ said the Tortoise.\n" +
                "                    The Hare laughed. ‘You? The slowest creature in the whole world? I’m not wasting my time racing a Tortoise.’\n" +
                "                    ‘What’s the matter?’ said the Tortoise. ‘Scared I might beat you?’\n" +
                "                    Some of the animals laughed at that so the Hare said, ‘Alright then, Tortoise. Let’s have a race…right now…then we’ll see who’s laughing.’\n" +
                "                    ‘Not today,’ said the Tortoise. ‘We’ll race next week. Got to do a bit of training first.’\n" +
                "                    Next morning the animals watched the Tortoise do his ‘training’. First he did some gentle stretching exercises to warm himself up…and then he started to run.\n" +
                "                    ‘Has he started running yet?’ asked the Fox.\n" +
                "                    ‘Hard to tell with Tortoises,’ said the Badger. ‘He’s definitely moving.’\n" +
                "                    ‘Is he?’ said the Fox.\n" +
                "                    ‘Tortoise, are you sure about this?’ said the Crow. ‘I mean the Hare IS very fast and you...well...’\n" +
                "                    ‘Don’t worry,’ said the Tortoise. ‘This is just day one. I’ll speed up. You’ll see.’\n" +
                "                    On the day of the race crowds of animals came to watch. The Tortoise slowly made his way to the starting line and then suddenly...the Hare arrived at top speed wearing a brand new track suit and four expensive-looking trainers.\n" +
                "                    ‘The race starts here.’ said the Fox, pointing to a line on the ground. ‘And ends at that tree on the other side of the field. First one to touch the tree is the winner.’\n" +
                "                    ‘Right, let’s get on with it,’ said the Hare. ‘Ready Tortoise? Ready to see some real speed?’\n" +
                "                    ‘I’m ready,’ said the Tortoise.\n" +
                "                    ‘Ready, steady...go!’ said the Fox and the race began.\n" +
                "                    The Hare roared off then stopped and looked back. The Tortoise was still crossing the starting line. The Hare ran back to the Tortoise.\n" +
                "                    ‘Didn’t you hear him say go? You can start, you know.’\n" +
                "                    ‘I have started,’ said the Tortoise.\n" +
                "                    ‘Look,’ said the Hare. ‘You’re going so slowly I’m going to have a rest. Might even have a little sleep. I’ll finish the race when I wake up and still beat you by miles.’\n" +
                "                    The Hare lay down in the sun and fell asleep. The Tortoise kept going. Slowly, steadily he moved across the field and by evening time he was getting close to the finishing tree. Still the Hare slept on and now the animals started to get excited.\n" +
                "                    ‘You know what? I think he might win,’ said a Rabbit.\n" +
                "                    ‘I can’t believe it,’ said the Badger. ‘The Tortoise might actually win.’\n" +
                "                    The animals started to get excited and as the Tortoise got close to the finishing tree they started to cheer.\n" +
                "                    ‘Come on, Tortoise!’ they shouted. ‘Nearly there. Keep going old friend. Keep going.’\n" +
                "                    But the noise of the cheering crowd woke up the Hare. He looked across the field, saw the Tortoise about to reach the tree and in a flash he was running.\n" +
                "                    The Tortoise heard the Hare thundering up behind him but he kept going...and going...and suddenly he was there. Just in time the Tortoise touched the tree with his nose. He’d done it. The Tortoise had beaten the Hare fair and square.\n" +
                "                    ‘There you go,’ said the Badger. ‘Slow and steady’s sometimes better than fast and flashy.’\n" +
                "                    ‘Not fair,’ said the Hare. ‘I was asleep. We have to run the race again. It’s not fair.’"));
        stories.add(new Story(R.drawable.lion_mouse, R.raw.lion, "The Lion and the Mouse", "A Mouse was scurrying through the forest when he saw a Lion sleeping under a tree.\n" +
                "        The Mouse stopped and said to the Lion: ‘You may be very big but I’m not scared of you.’\n" +
                "        The Mouse climbed up the Lion’s tail and sat down on its back leg. ‘Oh no, Mr Lion, you don’t frighten me one little bit.’\n" +
                "        Still the Lion didn’t move so the Mouse walked along the Lion’s side and climbed up towards his head. ‘All the animals in the forest are scared of you, Mr Lion, but not us mice ‘cos mice are the bravest creatures in the world.’\n" +
                "        Again the Lion didn’t move so the mouse climbed up the lion\\'s face and shouted in his ear. ‘Why should we be scared of lazy lions who spend all day snoring under trees?’\n" +
                "        The Mouse was enjoying himself and feeling very brave when he noticed that the Lion’s eye was open and looking straight at him.\n" +
                "        Quick as a flash the Lion grabbed the little Mouse in his paw.\n" +
                "        ‘What were you saying?’ said the Lion.\n" +
                "        ‘Nothing,’ said the little Mouse.\n" +
                "        ‘Something about brave mice and lazy lions..?’\n" +
                "        ‘That wasn’t me,’ said the Mouse. ‘I’d never say that. I think lions are…’\n" +
                "        ‘Quiet,’ said the Lion. ‘I’m going to eat you. What do you think about that?’\n" +
                "        ‘Don’t think that’s a good idea,’ said the Mouse.\n" +
                "        ‘Why’s that?’ said the Lion.\n" +
                "        ‘Because…’\n" +
                "        ‘Because what?’ said the Lion.\n" +
                "        ‘Because…’ And suddenly an idea flashed into the Mouse’s tiny head.\n" +
                "        ‘Because one day I could help you.’\n" +
                "        The Lion roared with laughter. ‘You? How could a tiny Mouse help a huge Lion like me..?’\n" +
                "        ‘I don’t know,’ said the Mouse. ‘Maybe I could…’\n" +
                "        ‘Yes?’ said the Lion.\n" +
                "        ‘Maybe I could…’\n" +
                "        ‘Yes?’\n" +
                "        The Mouse couldn’t think of a single way in which a tiny mouse could help a lion. He shut his eyes and waited to be eaten.\n" +
                "        But the Lion didn’t eat the Mouse. He just laughed and gently put the Mouse down on the ground.\n" +
                "        ‘That’s the funniest thing I’ve ever heard,’ said the Lion. ‘A tiny mouse helping a huge lion like me. I’m not going to eat you after all, little Mouse. You’re too funny to eat. I’m going to let you go.’\n" +
                "        ‘Oh, thank you,’ said the Mouse. ‘I think that’s a very wise decision. I meant what I said. I will help you, Mr Lion. One day. Just you wait and see.’\n" +
                "        The Lion laughed again: ‘Off you go little one,’ he roared, ‘before I die laughing.’\n" +
                "        The Mouse ran away feeling very lucky.\n" +
                "        But the very next day he was scurrying through the forest when he heard more roaring. This time though, it wasn’t a roar of laughter but a roar of pain and fear. The Mouse crept closer to the terrible sound and saw the same Lion all tangled up in a hunter’s net. The more he struggled the more tangled up he became.\n" +
                "\n" +
                "        He was just about to run away when the Mouse remembered how the Lion could have eaten him but let him go. And then the Mouse remembered saying: ‘I will help you, Mr Lion. One day. Just you wait and see.’\n" +
                "        Suddenly the Mouse was chewing at the ropes and gnawing as fast as he could. His teeth were tiny but razor sharp and soon he had cut the ropes and the Lion was free.\n" +
                "        The Mouse looked at the Lion. The Lion looked at the Mouse.\n" +
                "        ‘Yesterday I laughed when you said you would help me. I’m not laughing now. You are a very brave little Mouse. Just goes to show you don’t have to be big to be a big friend. Thank you.’\n" +
                "        ‘That’s alright,’ said the Mouse. ‘You get into trouble again just give me a shout, OK?’\n" +
                "        ‘OK,’ said the Lion and he turned and walked away.\n" +
                "        The Mouse watched him go. He smiled to himself and now somehow he didn’t feel quite so little.\n"));
        stories.add(new Story(R.drawable.fox_grapes, R.raw.fox, "The Fox & The Grapes", "        A Fox one day spied a beautiful bunch of ripe grapes hanging from a vine trained along the branches of a tree. The grapes seemed ready to burst with juice, and the Fox\\'s mouth watered as he gazed longingly at them.\n" +
                "        The bunch hung from a high branch, and the Fox had to jump for it. The first time he jumped he missed it by a long way. So he walked off a short distance and took a running leap at it, only to fall short once more. Again and again he tried, but in vain.\n" +
                "        Now he sat down and looked at the grapes in disgust.\n" +
                "        \"What a fool I am,\" he said. \"Here I am wearing myself out to get a bunch of sour grapes that are not worth gaping for.\"\n" +
                "        And off he walked very, very scornfully.\n"));
       stories.add(new Story(R.drawable.town_mouse_country, R.raw.mouse, "The Town Mouse & The Country Mouse", "        A Town Mouse once visited a relative who lived in the country.\n" +
               "        For lunch the Country Mouse served wheat stalks roots and acorns with a dash of cold water for drink.\n" +
               "        The Town Mouse ate very sparingly nibbling a little of this and a little of that and by her manner making it very plain that she ate the simple food only to be polite.\n" +
               "        After the meal the friends had a long talk or rather the Town Mouse talked about her life in the city while the Country Mouse listened.\n" +
               "        They then went to bed in a cozy nest in the hedgerow and slept in quiet and comfort until morning.\n"));
        final CustomAdapter adapter = new CustomAdapter(stories, this);
        ListView lv = findViewById(R.id.liv);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MediaPlayer mediaParser= MediaPlayer.create(StoryList.this,stories.get(position).getSound());
                mediaParser.start();
                Intent intent = new Intent(StoryList.this,MainStory.class);
                intent.putExtra("title",stories.get(position).getName());
                intent.putExtra("story",stories.get(position).getStory());
                intent.putExtra("pic",stories.get(position).getPic());
                startActivity(intent);


            }
        });
    }
}