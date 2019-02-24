package com.charlesrowland.ragingclaw.javajester;

import java.util.Random;

public class Jester {
    // look at all these funny jokes!
    private String jokes[] = {
            "Android: where ProgressBars go around in circles and Spinners don’t spin",
            "Documentation is like sex. When it's good, it's very good. When it's bad, it's better than nothing.",
            "Don't talk to me or my inherited members ever again!",
            "1/3 of US bandwidth is used by Netflix... the rest is used by `rm -rf node_modules && npm install`",
            "Eight bytes walk into a bar.  The bartender asks, 'Can I get you anything?'\n'Yeah,' reply the bytes. 'Make us a double.'",
            "How many programmers does it take to change a light bulb?\nNone – It’s a hardware problem",
            "Knock, knock.\n'Who's there?'\n*very long pause*\n'Java.'",
            "There are three kinds of lies: Lies, damned lies, and benchmarks",
            "The generation of random numbers is too important to be left to chance.",
            "Q: What do computers and air conditioners have in common?\nA: They both become useless when you open Windows.",
            "Q: Why do Java programmers have to wear glasses?\nA: Because they don't C#.",
            "Chuck Norris writes code that optimizes itself.",
            "A foo walks into a bar, takes a look around and says 'Hello World!'",
            "A SQL query goes into a bar, walks up to two tables and asks... 'Can I join you?'",
            "['hip', 'hip']",
            "A bear was taking a dump in the forest when a rabbit walked by. The bear said, \"Hey rabbit, does poo stick to your fur?\"\n\"No,\" replied the rabbit.\nThe bear picked up the rabbit and wiped his butt with him.",
            "Today at the bank, an old lady asked me to help check her balance. So I pushed her over.",
            "Did you hear about the restaurant on the moon? Great food, no atmosphere.",
            "What do you call a fake noodle? An Impasta.",
            "Want to hear a joke about paper? Nevermind it's tearable.",
            "Why did the coffee file a police report? It got mugged.",
            "5/4 of people admit that they’re bad with fractions.",
            "A Journalist asked a programmer: \"What makes code bad?\" No comment...",
            "Me: Will you be my Valentine?\nGirl: No way!\nMe: sudo will you be my Valentine?\nGirl: YES YES YES YES LETS GO!",
            "Programmer's song asks his father:\nDad, why does the sun rise on the east and set on the west?\nFather: It works? Don't touch it.",
            "What happens to Pastors who eat chili dogs? They have to sit in their own pew.",
            "What do sharks say when something radical happens? JAWESOME",
            "Guy walks into a bar with a slab of asphalt under arm. Says to the bartender: \"I’ll take a beer, and one for the road.\"",
            "What do you do with epileptic lettuce? You make a seizure salad!",
            "What does a cannibal do after dumping his girlfriend? Wipes his butt.",
            "Why does a Moon-rock taste better than an Earth-rock? Because it's a little meteor.",
            "What is invisible and smells like carrots? Rabbit farts",
            "There’s two fish in a tank. One turns to the other and says ‘You man the guns, I’ll drive’",
            "Why can’t you trust atoms? They make up everything."
    };

    public String entertainMeJester() {
        int id = new Random().nextInt(jokes.length);
        return jokes[id];
    }
}
