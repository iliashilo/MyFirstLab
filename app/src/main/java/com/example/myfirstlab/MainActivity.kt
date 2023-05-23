package com.example.myfirstlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var animalList: ArrayList<AnimalDC>
    lateinit var animalAdapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        animalList = ArrayList()

        animalList.add(
            AnimalDC(
                "Karamelka",
                "Cow",
                R.drawable.cow,
                "1. Cows have a unique digestive system that allows them to regurgitate their food and chew it again. This process is called \"chewing the cud\" and helps them extract maximum nutrients from plant material.\n" +
                        "\n" +
                        "2. Cows have panoramic vision, which means they can see almost 360 degrees around them without moving their heads. However, their depth perception is limited.\n" +
                        "\n" +
                        "3. Cows have an excellent sense of smell and can detect odors up to six miles away.\n" +
                        "\n" +
                        "4. Cows are social animals and form strong bonds with their herd members. They often display affection by grooming and licking each other.\n" +
                        "\n" +
                        "5. Cows communicate with each other using a wide range of vocalizations, including distinct calls for different situations such as mating, distress, or when calling their calves.\n" +
                        "\n"
            )
        )

        animalList.add(
            AnimalDC(
                "Jack",
                "Dog",
                R.drawable.dog,
                "1. Dogs have been domesticated for thousands of years and are descended from wolves. They were one of the first animals to be domesticated by humans.\n" +
                        "\n" +
                        "2. There are hundreds of dog breeds in the world, each with its own unique characteristics, appearance, and temperament.\n" +
                        "\n" +
                        "3. Dogs have an incredible sense of smell. They have up to 300 million olfactory receptors in their noses, compared to about 6 million in humans.\n" +
                        "\n" +
                        "4. The Basenji is known as the \"barkless dog\" because it doesn't bark like other dogs. Instead, it makes a unique yodel-like sound called a \"baroo.\"\n" +
                        "\n" +
                        "5. Dogs have three eyelids: an upper lid, a lower lid, and a third lid called a \"haw.\" The haw helps protect their eyes and keep them moist.\n"
            )
        )

        animalList.add(
            AnimalDC(
                "Suzy",
                "Sheep",
                R.drawable.sheep,
                "1. Sheep have excellent peripheral vision, with their eyes positioned on the sides of their heads, allowing them to see predators approaching from different angles.\n" +
                        "\n" +
                        "2. Sheep have a strong herding instinct and tend to follow a leader. This behavior helps them stay together and protects them from predators.\n" +
                        "\n" +
                        "3. Sheep have an exceptional sense of smell and can recognize familiar scents, including the scent of their lambs.\n" +
                        "\n" +
                        "4. Sheep have a unique digestive system that allows them to break down plant materials, such as grass and hay, through a process called rumination. They regurgitate and re-chew their food to extract the maximum amount of nutrients.\n" +
                        "\n" +
                        "5. Sheep have a natural tolerance to cold weather and can survive in harsh climates. Their woolly coat provides insulation and keeps them warm, even in freezing temperatures.\n"
            )
        )
        animalList.add(
            AnimalDC(
                "Peppa",
                "Pig",
                R.drawable.pig,
                "1. Pigs are highly intelligent animals and are often ranked as one of the most intelligent domesticated animals, even surpassing dogs and cats in certain tests.\n" +
                        "\n" +
                        "2. Pigs have an excellent sense of smell, which is estimated to be more than 2,000 times more powerful than that of humans. This makes them great at finding truffles and other hidden food sources.\n" +
                        "\n" +
                        "3. Contrary to popular belief, pigs are actually very clean animals. They prefer to designate specific areas for their waste and will avoid soiling their living space if given the opportunity.\n" +
                        "\n" +
                        "4. Pigs are social creatures and enjoy living in groups called \"sounders.\" They communicate with each other through a variety of vocalizations, including grunts, squeals, and snorts.\n" +
                        "\n" +
                        "5. Wild pigs, known as boars, are excellent swimmers and are capable of crossing bodies of water to search for food or escape predators.\n"

            )
        )
        animalList.add(
            AnimalDC(
                "Tom",
                "Cat",
                R.drawable.cat,
                "1. Cats have retractable claws, which help them maintain sharpness and prevent them from being worn down when not in use.\n" +
                        "\n" +
                        "2. A cat's nose print is unique, similar to how human fingerprints are unique, making it a potential identification method.\n" +
                        "\n" +
                        "3. Cats have a specialized collarbone that allows them to always land on their feet when they fall, known as the \"righting reflex.\"\n" +
                        "\n" +
                        "4. A group of cats is called a clowder.\n" +
                        "\n" +
                        "5. Cats have a highly developed sense of hearing and can hear ultrasonic sounds that are inaudible to humans."
            )
        )

        animalAdapter = Adapter(animalList, this)
        recyclerView.adapter = animalAdapter
    }
}