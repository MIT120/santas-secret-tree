package com.example.santassecrettree

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.text.Html
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.santassecrettree.typer.TypeWriter


class MainActivity : AppCompatActivity() {

    private val answer = "omlvgpokxfnctqyersabjwzizp omlvtdhxxflctqyersabjwziup omlvgdakxfnctqyersabzmziup omlvgdhkxfnchqyersarjwsiup omlvgdnkxfnctqyersabhwziuq omvlgdhkxfnctqyersajjwziup fmlvgdbkxfnctqyersabjwzqup omlvcdhexfnctqyersibjwziup omlvgdhkxfnctqyersoyjnziup omdbgdhpxfnctqyersabjwziup omlvgdbkxfnctiyersabjwziwp omlogdhkxfncpqyersabjfziup omlvgdhkxfncxayersabwwziup omlvgdhkxfgctqyepsabjnziup omlvzdhkxfnctqyerxabjwoiup orlvtdhoxfnctqyersabjwziup omgvgdhkxfnctqyetsarjwziup omlvgdhkxunctcqersabjwziup omlvgdhkxfnctqyertakjwziun omlvhdhkxfhetqyersabjwziup omlvjdhkxfnctqyersabjtzirp omsvgdhkifnctqyeryabjwziup ohlvgdhkxfncteyersabtwziup omlvgdhkxjqctqyerkabjwziup omljgdhkxfncxqiersabjwziup omlvgdhkxvnctqyetscbjwziup omlvgdhxxfnctqykrsabjwziui omlbgdhkxfnetqyersabjwliup omlvgvhkxfnctqyerjabjwzwup wmlvgdhkxfnctqyyrsabjwziuc omlvgdhkufnctqxersabjwpiup omlvgdtkxfnctqyercvbjwziup omtvgdhkxfnctqygrsmbjwziup omlvgdbkxfnctqyersagjwzrup omlvgdpksfnctqyorsabjwziup omlvgdlkxfnctqyerhaajwziup omlvgdhkxfnctqyersabjwkiqh omlvgdykxfnctqdersdbjwziup omligdhklfnctpyersabjwziup omlvzdhkxfnctryersabjwziap nmlvgdqkxfnctqyemsabjwziup omlvgdhkxoncqqyersabjyziup otlvgdhkxfnctqyersabjwzzhp omlvgdhvxfnctqyirsabjwziue omlvgohkxfnctqjersabjwzeup omlngdhkxfnytqyersabjwsiup gmlvgbhkxfnctqyersabjwziyp nmlvgxhkxfnctqyxrsabjwziup omlvwdhkufnctqyerfabjwziup omlvqdhkxfnctqyersabfmziup omlvgdhkxfnctqlerscbjeziup omlvgdhkxfncxqyerjabjgziup omlvgdhkxwnctqyersvbjwriup ozlvgdhkxfnctqyersabjjziuj omlvguhkxfnctqyersabjwznut ozlvwdhkxfactqyersabjwziup oplvgdhkxfnctqyersakjwiiup omlkgbhkxfnctqyetsabjwziup oukvgdhkxfnctqyerslbjwziup omllgwhkxfnctqyersasjwziup omlvgdqkvfnctqyjrsabjwziup omlvguhkxfnctqyepsakjwziup oblvgdhkxfnctqyersibjwciup omlvgdhkxfpetqyersnbjwziup omlvgdhkxfnctqyersabgwpmup ohlvgdhkxfnctqyersgbjwdiup omlvgkhkxfnctqyarsabjwziuj omtvgdhkxfnctqoersabjwzfup omlvgdhkxfncbqyersafjwzkup amlvgdhkmfnctqyorsabjwziup omlvndhkxfnctbyersagjwziup oslvgdhkxfactqyersabjwziip omlvgdhkxfnrtqyerumbjwziup omjvgdhaxfnctqyersajjwziup omlvgdhkxfyctqyersabjvziuf omlvgdhkxfgctqyervabjwzuup oclvhdhkxfnctqyirsabjwziup omlvgdhkxfnctqyrrsbbjwsiup nmlvghhkxfnctqyersayjwziup omlvgdhksfnzcqyersabjwziup omlvgdhbxknctqyerzabjwziup omlvgdhsxflctqyercabjwziup omlvgdhkxfncthyersabjpzgup omlvgdhkxfnhtqyersadjwzilp omlvgdhyxfnctqyershjjwziup omlvhdhkxfnctqytesabjwziup omlvgbhkxfnctqyhrsabjwmiup omlvnyhkxfnctqyersabbwziup omlvgdhkxfnhzqcersabjwziup omljgdhkvynctqyersabjwziup omrvgdhkxfnctqysrsabjmziup omlvgdhgxenctqyerfabjwziup omlvgdokxfncvqyersasjwziup omlvguhkxfnctqyersabbbziup imkvgdhkxfnctqyqrsabjwziup omlvgdikxfnctwyersabbwziup oulvgdhuxfngtqyersabjwziup omlvgdhkxfdctqqbrsabjwziup omlvgdhbofnctqyersmbjwziup omlzgdhkxfnctzyecsabjwziup oflvgdhkxfnctqyerpabjwzcup ommvgdhkxfnctqyicsabjwziup omlvgdhkxfnctqyewsabjwzisd ojlvgdhfxfnctqyersabjwzihp smlvgdhkxfnctqyzrsabjwaiup ohlvgdhkxfnctqyersabnwziue jslvgdhkxfnctqdersabjwziup omlvgdhkdenctwyersabjwziup orljgdhkxbnctqyersabjwziup omlvgdhkxfnctaaersabjwzrup qmlvgdhknfncqqyersabjwziup omlvgdhkxfnctqyerssbjwncup omlvgdhkxynctqdercabjwziup omivgdhpxfnctqiersabjwziup omuvgdbkxfnctqyersajjwziup omlvbdokxfnctqyehsabjwziup gmlvgdhkxcnctqyemsabjwziup hmlvgdhkxfncsqyersabjwzidp omlvgdhkxftztqytrsabjwziup omlvgdhkxfnatqyeesabjbziup omlvodhkxfnctqbirsabjwziup omlvgdhsifnctqyersabjwziop oyvvgdhkxfnctqyersabjwzinp qmlvgdhkxfnctqyersdbawziup omlvguhkxfncuqyersabjwzipp omspgdhkxfnctqyersabjwzifp omlvgdhkxfnamqyeryabjwziup omlvgdhkngnctqyxrsabjwziup omdvcdhkxfnctqynrsabjwziup omyvgdhkxfnctqyeryabjyziup hmlvgdhkxfnctqyersabjwzwap ombvgdhkxfyctqyersabjwziuk omlvadhkxfnctqyersoqjwziup ollugdhkxfnctqyersabjwzizp omlvgdhkxfncvqmersabjwiiup omlvgdkkxfnupqyersabjwziup omlvgdhkxfncratersabjwziup oklvgdskxfnctqyersabjkziup omlvgdhkxfnctqyernebgwziup omsvgdhkxfnctqyersaejwziuv omlvgdhkxfrctlynrsabjwziup omlggdhkxfnctqyersbbjmziup omlvgdhfxfnctqyehrabjwziup omqvgdhkxfnctqcersabjwzfup omlvgdhklfncqxyersabjwziup omlvgxhkxfnctqyersabebziup omlfgdhkxfnctjyersabkwziup omlvgdhkxfnctqysrtabjwqiup omlvgdhkxfnltqaersabfwziup ofhvgdhkxfnctqyessabjwziup omlvpdekxfnctqyerscbjwziup omlvcdhkxlnbtqyersabjwziup omlvfdhkxfnctqyersabjwrnup omlvddhkxfncdqyersabjwziut omlvgdhkxfnctqxersabjhiiup omidgdhkxfnctqyeysabjwziup omlogdhkxfnptqyersabjwniup omlvgdhkxfnwthyersabjwziuz omevgdhkxgnctbyersabjwziup omlvgdhkxfnytqyersabjozuup omlvgvhkxfmctqyersabjwziuw oelvgdhkxfoctqyersadjwziup lmlvgdhkxfnctqeersabjwzisp omlvgdhkxfcctqyersasjwzibp gmlvgdhkyfnctqyersabjwziuz omlvgdhkxfnctslersabjwziuf omlvgehkxfnctqyeosabjwziyp otlggdhkxfjctqyersabjwziup bmjvgdhixfnctqyersabjwziup omlvgqhkxfnctqdezsabjwziup omlvgbhkxfnciqnersabjwziup omlvgdhlxfnctqydrsdbjwziup omlvgdhkxfncfqyersabjwxinp ymlvgdhkxfnctqyersabhwziui omdvgdhkxfnctqyersabjwxdup bmlvgdhkxfnwtwyersabjwziup dmlvgmhkxfnctqyxrsabjwziup omlvgdhkxbnntqyersabjiziup omlvgdhkmfnctlyersgbjwziup omlvgdhkxfnctqhersablwzixp ommvgdhkxfwctqyersabnwziup omlkgdhjxfnctqyersabjwjiup omlvgdhrxfnctqyeasabjnziup omvvgdhkxtnctqyersabjtziup omlvgdhkufgctqyersabfwziup omqvgwhkxfnctqyevsabjwziup oalvgdhkyfyctqyersabjwziup omlvgdhkxfnctqyefvabjwhiup jmlvgdakxfnctqyersabjwtiup gmlvgmhkxfnctqyersaqjwziup omlvgdhkxcnctqydrszbjwziup omlvgdhkxfnctxnersxbjwziup omlvgyhkxfnctqyersabjeaiup omlcgdhkxfncvqyersabjoziup omlvgdhkxfycttyercabjwziup omlmgdhkpsnctqyersabjwziup lmlvglhkxfnctqdersabjwziup omlvgdhxdfncoqyersabjwziup omlvgdhkxfnctqyersabjwkixv oplvgdhkxfnctiyersabjoziup omlvgdnkxfnctdyersebjwziup omlvguckxfnctqwersabjwziup omlvgdhojfnctqyersabjoziup opjvxdhkxfnctqyersabjwziup omevgdhkdflctqyersabjwziup omlvgilkxfncaqyersabjwziup omlvgdhkqfnctqyersabunziup dmlvgdhkxrnctqyerssbjwziup omlvgdzcxfnctqyersabjwniup omlvgdhkxfnctqyeraabpsziup omlvgdhkxfnctqlersabjtziul omlvgbhkxfnctqyeysabjwpiup omlvgdhvxfnmttyersabjwziup omlvgdhkxznctqyersabewziua oqlvgdhkxfnctqjersabjfziup omlvgdhkqfnctqyoysabjwziup omlvgdhkxfnctqylrzabbwziup oalvguhkxfnctqyersabawziup omlvgdokxfncvqyersasjlziup omlvgdhkcfnctqyersazjwzfup oslvgdhpxfnctqyhrsabjwziup omlvgdhkxfnotqcqrsabjwziup umlvgdhlxfnctqyersnbjwziup oxlvgdhkxfnktjyersabjwziup omlvgdhkxhncnqyersabjwzirp jmlvgdhkxfncfqyersabjwzqup omlvgdhkbfnutvyersabjwziup omhvgddkxfnctqyersabqwziup omlvgdukxfnbtqyersabjwzjup oylvndhkxfnctqversabjwziup omlvgdhkcfnctqyersamjwfiup omlvgdskxfnctqyerssbjgziup qmlvgdhkxfncxqyersabiwziup omlvghhkxfnctwyersaljwziup omlvgdhkpfnbtqyersnbjwziup omlvgthkxfnctnyersabjwziut omlvgdhkpfnctqyeisabjfziup omlvgdhrxrnctqyersabjwzigp omlvjdhkxfnctqyersabpwwiup omlvgdhkxfnctsyersabjwzixl amlvgdhktfnctqyersabfwziup oklvvdhkxfnctoyersabjwziup rmlvgdhkxfncwqyersabxwziup omlvgdhkxfnctqyersabiwzjfp omlvgehkxfnctqyersebjzziup omlvgdhkxfncaqyersabwwzoup omlvgdhkxfncjqyersanjwfiup omlvgdhkwfnctqyersqbjwziux omrvgdhjxfnctqyeksabjwziup omlvgdhkxfnctpyersaftwziup"
    private lateinit var answerEditText: EditText
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        answerEditText = this.findViewById(R.id.edit_answer)
        val tw: TypeWriter  = findViewById(R.id.tv)
        tw.text = ""
        tw.setCharacterDelay(1)
        tw.animateText(
            Html.fromHtml(("<p><font color='@color/colorText'>\n" +
                    "You stop falling through time, catch your breath, and check the screen on the device. Destination reached. Current Year: 1518. Current Location: North Pole Utility Closet 83N10. You made it! Now, to find those anomalies."+
                    "        </font></p>\n" +
                    "\n"+
                    "<p><font color='@color/colorText'>\n" +
                    "Outside the utility closet, you hear footsteps and a voice. ...I'm not sure either. But now that so many people have chimneys, maybe he could sneak in that way? Another voice responds, Actually, we've been working on a new kind of" +
                    "        </font>\n" +
                    "<font color='#e8682e'" +
                    "    >\n" +
                    " suit" +
                    "        </font>\n" +
                    "<font color='@color/colorText'>\n" +
                    "that would let him fit through tight spaces like that. But, I heard that a few days ago, they lost the prototype fabric, the design plans, everything! Nobody on the team can even seem to remember important details of the project!"+
                    "        </font></p>\n" +
                    "<p><font color='@color/colorText'>\n" +
                    "\"Wouldn't they have had enough fabric to fill several boxes in the warehouse? They'd be stored together, so the box IDs should be similar. Too bad it would take forever to search the warehouse for"+
                    "<font color='#e8682e'>\n" +
                    "two similar box IDs...\" "+
                    "        </font>\n" +
                    "<font color='@color/colorText'>\n" +
                    " They walk too far away to hear any more."+
                    "        </font></p>\n" +
                    "<p><font color='@color/colorText'>\n" +
                    "Late at night, you sneak to the warehouse - who knows what kinds of paradoxes you could cause if you were discovered - and use your fancy wrist device to quickly scan every box and produce a list of the likely candidates (your puzzle input)."+
                    "       </font></p>\n" +
                    "<p><font color='@color/colorText'>\n" +
                    "To make sure you didn't miss any, you scan the likely candidate boxes again, counting the number that have an ID containing" +
                    "</font>\n" +
                    "<font color='#e8682e'>\n" +
                    "exactly two of any letter " +
                    "</font>\n" +
                    "<font color='@color/colorText'>\n" +
                    "and then separately counting those with " +
                    "</font>\n" +
                    "<font color='#e8682e'>\n" +
                    "exactly three of any letter. " +
                    "</font>\n" +
                    "<font color='@color/colorText'>\n" +
                    "You can multiply those two counts together to get a rudimentary checksum and compare it to what your device predicts." +
                    "</font></p>\n" +
                    "\n" +
                    "        <p><font\n" +
                    "            color='#ffff66'\n" +
                    "            font-style='normal'\n" +
                    "            text-shadow='0 0 5px #ffff66'\n" +
                    "            font-family: 'Source Code Pro'\n" +
                    "            >\n" +
                    "\n" +
                    "For example, if you see the following box IDs:\n" +
                    "\n" +
                    "abcdef contains no letters that appear exactly two or three times.\n" +
                    "bababc contains two a and three b, so it counts for both.\n" +
                    "abbcde contains two b, but no letter appears exactly three times.\n" +
                    "abcccd contains three c, but no letter appears exactly two times.\n" +
                    "aabcdd contains two a and two d, but it only counts once.\n" +
                    "abcdee contains two e.\n" +
                    "ababab contains three a and three b, but it only counts once."+
                    "        </font></p>\n" +
                    "        <p><font color='#00cc00'\n" +
                    "            text-shadow='0 0 2px #00cc00'>\n" +
                    "Of these box IDs, four of them contain a letter which appears exactly twice, and three of them contain a letter which appears exactly three times. Multiplying these together produces a checksum of" +
                            "</font>\n" +
                    "<font color='#e8682e'>\n" +
                    " 4 * 3 = 12.\n" +
                    "        </font>\n" +
                    "\n" +
                    "<font color='#e8682e'>\n" +
                    "What is the checksum" +
                    "        </font>\n" +
                    "<font color='#00cc00'>\n" +
                    " for your list of box IDs?"+
                    " </font></p>" +
                    "<p> HERE THEY ARE: " +
                    "oiwcdpbseqgxryfmlpktnupvza\n" +
                    "oiwddpbsuqhxryfmlgkznujvza\n" +
                    "ziwcdpbsechxrvfmlgktnujvza\n" +
                    "oiwcgpbseqhxryfmmgktnhjvza\n" +
                    "owwcdpbseqhxryfmlgktnqjvze\n" +
                    "oiscdkbseqhxrffmlgktnujvza\n" +
                    "oiwcdibseqoxrnfmlgktnujvza\n" +
                    "oiwcdpbsejhxryfmlektnujiza\n" +
                    "oewcdpbsephxryfmlgkwnujvza\n" +
                    "riwcdpbseqhxryfmlgktnujzaa\n" +
                    "omwcdpbseqwxryfmlgktnujvqa\n" +
                    "oiwcdqqneqhxryfmlgktnujvza\n" +
                    "oawcdvaseqhxryfmlgktnujvza\n" +
                    "oiwcdabseqhxcyfmlkktnujvza\n" +
                    "oiwcdpbseqhxryfmlrktrufvza\n" +
                    "oiwcdpbseqhxdyfmlgqtnujkza\n" +
                    "oiwcdpbseqhxrmfolgktnujvzy\n" +
                    "oiwcdpeseqhxnyfmlgktnejvza\n" +
                    "oiwcdpbseqhxrynmlaktlujvza\n" +
                    "oiwcdpbseqixryfmlektncjvza\n" +
                    "liwtdpbseqhxryfylgktnujvza\n" +
                    "ouwcdpbszqhxryfmlgktnajvza\n" +
                    "oiwzdpbseqhxryfmngktnujvga\n" +
                    "wiwcfpbseqhxryfmlgktnuhvza\n" +
                    "oiwcdpbselhfryfmlrktnujvza\n" +
                    "oywcdpbveqhxryfmlgktnujdza\n" +
                    "oiwcdpbsiqhxryfmqiktnujvza\n" +
                    "obwcdhbseqhxryfmlgktnujvqa\n" +
                    "oitcdpbseqhfryfmlyktnujvza\n" +
                    "oiwcdpbseqhxryfmlnutnujqza\n" +
                    "oiwcdpbseqhxnyfmlhktnujtza\n" +
                    "oiwcdpbseqhbryfmlgkunuwvza\n" +
                    "oiwcopbseqhiryfmlgktnkjvza\n" +
                    "oiwcdpsseqhxryfklrktnujvza\n" +
                    "oiwcdpsrsqhxryfmlgktnujvza\n" +
                    "oiwcdpbsyqrxryfmlgktnujvzc\n" +
                    "ojwcepbseqhxryfmlgktnujvfa\n" +
                    "oiwcdpbseqhxrlfmlgvtnujvzr\n" +
                    "oiycdpbsethsryfmlgktnujvza\n" +
                    "eiwcdpbseqwxryfmlgktnujcza\n" +
                    "oiocdpbseqhxryfxlgktaujvza\n" +
                    "qiwydpbseqhpryfmlgktnujvza\n" +
                    "ziwcdpbseqhxryfmlgktsuuvza\n" +
                    "oiwcdpbseqheryfmygxtnujvza\n" +
                    "oiwidpbseqhxryfulgktnujvzm\n" +
                    "oiscdpdseqhxryfmlgktnujvya\n" +
                    "oiwmypbseqhxryfmlgktnuxvza\n" +
                    "oizcwbbseqhxryfmlgktnujvza\n" +
                    "oiwcdpbseqpxryfmlgxfnujvza\n" +
                    "oiwpdpbscqhxryxmlgktnujvza\n" +
                    "oiwcdpbseqhxrifrlgkxnujvza\n" +
                    "oiwcdpbsrqhxrifmlgktnzjvza\n" +
                    "tiwcdpbseqhxryfmegkvjujvza\n" +
                    "oiwcddbseqhxryfingktnujvza\n" +
                    "oiwcdpbsiqhiryfmlgktnucvza\n" +
                    "oiwcipbseqhxrkfmlgktnuvvza\n" +
                    "kiwcdpbseqhxryfmlbkonujvza\n" +
                    "qiwcdhbsedhxryfmlgktnujvza\n" +
                    "siwcdpbseqhxryfmsgktnujvua\n" +
                    "oqwcdpbseqhxryfmlyktndjvza\n" +
                    "oiwcqnbseehxryfmlgktnujvza\n" +
                    "oiwcdybseqhxryfmlgbtnujvia\n" +
                    "oiwcdpbsejhxryfdlgktngjvza\n" +
                    "oawcdpbseqhxrbfmlkktnujvza\n" +
                    "oilcdpbseqhhrjfmlgktnujvza\n" +
                    "oibcdpbseqhxryfmngktnucvza\n" +
                    "niwcdpbseqhxryfmlgkuaujvza\n" +
                    "oiwcdpbseqhxryfmqgmtnujvha\n" +
                    "oiwcdpbseqhcryfxlgktnzjvza\n" +
                    "oiwcdpaseqhxryfmqgktnujvzl\n" +
                    "oiwcdpbseqhxjyfmlgkonujvzx\n" +
                    "oiwmdzbseqlxryfmlgktnujvza\n" +
                    "oiwhdpbsexhxryfmlgktnujvzw\n" +
                    "oiwctpbseqhxryfmlgktnummza\n" +
                    "oiwcdpbseqoxrydmlgktnujvoa\n" +
                    "oiwkdpvseqhxeyfmlgktnujvza\n" +
                    "oixcdpbsemhxryfmlgctnujvza\n" +
                    "oimcdpbseqhxryfmlgktnujvlr\n" +
                    "oiwcdpbseehxrywmlgktnejvza\n" +
                    "oiwcdpbseqoxhyfmlgktnujyza\n" +
                    "oiwcdpbsethxryfmlgktnrjvxa\n" +
                    "oiwcdpbxeqhxryfmlgktnrjvzb\n" +
                    "ogeadpbseqhxryfmlgktnujvza\n" +
                    "eiwcdpbseqhxryfmlgktnvuvza\n" +
                    "oiwcdpbseqhxryfmlgktnujaxv\n" +
                    "siwcdpbsuqhxryfmlgktnuavza\n" +
                    "oixcdpbseqhxryfmlgatnujvzy\n" +
                    "oiwcdpbzeghmryfmlgktnujvza\n" +
                    "oiwcdpbieqhxryfmlgktyujvzr\n" +
                    "oiwcdpbseqhxeyfhlgktngjvza\n" +
                    "oiwcdpbseqhjoyrmlgktnujvza\n" +
                    "iiwcdpbseqhxryfmwhktnujvza\n" +
                    "oixcdpbsiqhxryfmagktnujvza\n" +
                    "oiwcdpfljqhxryfmlgktnujvza\n" +
                    "oivcdpbseqhxrqfmlgktnujvca\n" +
                    "ovwcdpbseqhxzyfmlgkenujvza\n" +
                    "oiwxdpgseqhxryfmlgktnhjvza\n" +
                    "oibcdpbbeohxryfmlgktnujvza\n" +
                    "oiwcrpbseqhxrygmlgwtnujvza\n" +
                    "jiwcdpbseqkxryfmlgntnujvza\n" +
                    "oiwcdbbseqhxrywmlgktnujvra\n" +
                    "oiwcdpbteqyxoyfmlgktnujvza\n" +
                    "oiwcdjbsvqvxryfmlgktnujvza\n" +
                    "obwcdukseqhxryfmlgktnujvza\n" +
                    "oifcdpdseqhxryfmlgktnujsza\n" +
                    "oiwcdpbseqhxryfalgktnujyda\n" +
                    "oiwcwpbseqhxrnfmkgktnujvza\n" +
                    "oswcdpbsethcryfmlgktnujvza\n" +
                    "oiwcdpbieqhxryfmlgktnuoiza\n" +
                    "oiwcdibsehhxryfmzgktnujvza\n" +
                    "oisjdpbseqhxryfmfgktnujvza\n" +
                    "oiwcjpbseqkxqyfmlgktnujvza\n" +
                    "obwcdpbshqhgryfmlgktnujvza\n" +
                    "oiwcspbseqhxryxmlgktnujvzl\n" +
                    "oiwcdvbswqhxryfmlgklnujvza\n" +
                    "oiwcdhuseqhxryfmlgdtnujvza\n" +
                    "oiwcdpbkeqdxryfmlgktnujvzv\n" +
                    "oiwcdpzseqhxcyfmlgksnujvza\n" +
                    "oiwcdpbseqhxryfmbkkvnujvza\n" +
                    "qiwcdpbseqhxrnfmlgktnujvha\n" +
                    "okwcdpbseqhxryfmdgktgujvza\n" +
                    "oiwcdpbkeqhxryfmldktnujvzu\n" +
                    "oiwctpxseqhxgyfmlgktnujvza\n" +
                    "oiwcdpbseqhxrykmlgktnujita\n" +
                    "oiwcdpbseqhxryfmldktyujnza\n" +
                    "oiwcdpbszqhxrjfmlgktnuqvza\n" +
                    "oiwcdpbeeqhxrykmlgktnujrza\n" +
                    "oiwcvpbseqhxryhmlgwtnujvza\n" +
                    "oiwcdpbpeehxryfmlgktnujvzz\n" +
                    "oiwcdbbsxqhxyyfmlgktnujvza\n" +
                    "oiwkdpbseqhxryfplgktnujeza\n" +
                    "opwcdpbseqhxdyfmlgctnujvza\n" +
                    "oowcdpbseqhnryfmlgktnujvga\n" +
                    "oawzdibseqhxryfmlgktnujvza\n" +
                    "oiwcdpbfeqzxrjfmlgktnujvza\n" +
                    "oiwcdpbseqaxryfmlgkonulvza\n" +
                    "oiacdpbseqvxryfmlgktvujvza\n" +
                    "oiwudpbseqhxryfwlgktnujvka\n" +
                    "oiwcdpbjeqhxryfymgktnujvza\n" +
                    "oiwcdpbweqhxrynmlgktnujaza\n" +
                    "oiwcdpbseqdxryfclgvtnujvza\n" +
                    "oiwcdppseqhxryfmlgmtzujvza\n" +
                    "oiwcdpbseqhxrhfelektnujvza\n" +
                    "kiwcdpbsnqhxryfmegktnujvza\n" +
                    "oiwcdpbseqpxryfmlgzwnujvza\n" +
                    "eiwcdpbseqnxryfplgktnujvza\n" +
                    "oiwcdbbseqhxryfmlmktnujvha\n" +
                    "oiwcdpbseqhxryfmlgktjhjvka\n" +
                    "oiwcdpbseqhxnyfylgktnujvzs\n" +
                    "oiwcdpbbxqhxryfmzgktnujvza\n" +
                    "opwcdpbseqhfryfmlgktnujzza\n" +
                    "oiwcdpbsjqpxryfmtgktnujvza\n" +
                    "oiwcdpbseqhyqbfmlgktnujvza\n" +
                    "oxwcdpbseqhxrffmlgktiujvza\n" +
                    "oiwcdpbseqhxgyfmlgytnujvzq\n" +
                    "oiwidpbseqhxryfmlgxtnujvzd\n" +
                    "oiwcdpbshqhxryzmlpktnujvza\n" +
                    "oifcdpbseqbxryfmlgktdujvza\n" +
                    "biwcdzbseqhxtyfmlgktnujvza\n" +
                    "oiwcdpbswqhxryfmlgutnujvca\n" +
                    "xiwcdpbseqhxryxmlnktnujvza\n" +
                    "oiwcdpzseqhxryfrlgktdujvza\n" +
                    "oiwudpbseqhxryfmlgkqnurvza\n" +
                    "oiwqdpbseihiryfmlgktnujvza\n" +
                    "iiwjdpbseqhxryamlgktnujvza\n" +
                    "oiwcdplseqhqryfmmgktnujvza\n" +
                    "oiwcdppseqhxrmfmlgklnujvza\n" +
                    "oiwcdobseqhxryfmmgkttujvza\n" +
                    "odwcdpbseqhxryfmlgktnujvyk\n" +
                    "oiwcdpkseqhxrhfmlgktntjvza\n" +
                    "oiocdpbseqhxryfmlgjknujvza\n" +
                    "oiicdpbieqhxryfmlgksnujvza\n" +
                    "oiwcdpbseqhxryemlgktnujdla\n" +
                    "oiwcdpbseqdxryfmlgktsujvzt\n" +
                    "oiwcdcksnqhxryfmlgktnujvza\n" +
                    "oowcdpbseqhxryfmlgsfnujvza\n" +
                    "oawcdpbseqhxryfmljktnuevza\n" +
                    "oiwcdpbsaqhxrffmzgktnujvza\n" +
                    "oiwcipbseqhcryfmlgktnujvga\n" +
                    "oiwcdpbsewhxrbfmlgktnuuvza\n" +
                    "oiwcdpbsewhxryfmlgkunujvzc\n" +
                    "oiwcdpbseqhxryfmlgktiujkga\n" +
                    "jiwcdpbseqhxrlfmlgktnurvza\n" +
                    "tiwcdpbseqoxryfmliktnujvza\n" +
                    "oiwcdpbsenhxryfmlgkskujvza\n" +
                    "oiwcdpbseqhxvyfmlhktoujvza\n" +
                    "oiwcdpbseqhxeyfmlgmtnunvza\n" +
                    "oiwcdpbseqhxdyfmloktnujvzu\n" +
                    "oiwcdpbseqgxryfmlgkynejvza\n" +
                    "oudcdpbseqhxryfmlgktmujvza\n" +
                    "oiwcdpbseqhxryfmvgktnucvzc\n" +
                    "oiwcdpbseqhxrysalgwtnujvza\n" +
                    "odwodpbseqhgryfmlgktnujvza\n" +
                    "oiwcdpbseqheryzmlgktnujgza\n" +
                    "oiwcdpbseqhxryfalgwtnujvba\n" +
                    "oiwcdpbseqhxryfmlgtdnuhvza\n" +
                    "oiocdpbseqhxrefulgktnujvza\n" +
                    "kiwcdpbseqhxrywolgktnujvza\n" +
                    "niwcdpbseksxryfmlgktnujvza\n" +
                    "oiwcdybseqexryfalgktnujvza\n" +
                    "oiwcdpbbeqhxryamlgktnujpza\n" +
                    "oiecdqbseqhxryfmlgktnujcza\n" +
                    "oiwcdpbsqqhxlyfmlpktnujvza\n" +
                    "oiwcdpbsaqheryfmlgktnujlza\n" +
                    "oiecdpbseqhxryfmlgkknujvzz\n" +
                    "oiwcapbsdqhxryfmlgktvujvza\n" +
                    "ojwcdxbseqhxryfmlgktrujvza\n" +
                    "oiwhdpbseqvxrzfmlgktnujvza\n" +
                    "oiwcdppseqhtryfmlgktnujvzs\n" +
                    "oikcdpbsfqhxryfmdgktnujvza\n" +
                    "owwczpbseqhxryfilgktnujvza\n" +
                    "oifwdpbseqhxryfmlgktnujfza\n" +
                    "oowcdpbseqhxrprmlgktnujvza\n" +
                    "oiwcapbseqhxryfmjgktnujvze\n" +
                    "oiwcdpaseqhdrybmlgktnujvza\n" +
                    "tiwcdpbseqhxryfmlgkvjujvza\n" +
                    "xiwcdpbseqhoryfmlgktnujvqa\n" +
                    "eiwrdpbsyqhxryfmlgktnujvza\n" +
                    "oiwcdpbseqhxranmlgktnujvzt\n" +
                    "oiwcdpbseqhxryfqlgktnudaza\n" +
                    "oiwcdpbsvqhxrywmlgktnsjvza\n" +
                    "oewcdpbseqhxryfmlgkunujvma\n" +
                    "oiwcdpbseqhjrywmlgktnujvzb\n" +
                    "omwcdpbseqhxryfmlgktwujsza\n" +
                    "oiwcdpbyxqhxryfmlgrtnujvza\n" +
                    "oiwidpbseqhxryfhlgktnunvza\n" +
                    "oqwcdpbweqhxrybmlgktnujvza\n" +
                    "oiwcdqbseqhxryfrlgktnujfza\n" +
                    "oiacdpbseqhdryfmlgktaujvza\n" +
                    "oiwcdpbstqhxmyfmlgktyujvza\n" +
                    "oiwcdpbseqhxeyfclgktjujvza\n" +
                    "wiwcdpeseqhxryfmlgktnujvzx\n" +
                    "viwcdpbseqhxryfmlgvtvujvza\n" +
                    "oircdpbseqhxcyfmlgktnujvma\n" +
                    "miwcdpbseqtwryfmlgktnujvza\n" +
                    "oiwcppbseqhxcyfmlgxtnujvza\n" +
                    "giwcrpbseqhxryfmlgktnudvza\n" +
                    "onwcvpbseqhxryfmlgktnujqza\n" +
                    "oiwcipbseqhxryfmlgitnuqvza\n" +
                    "oiwcdpbseqhxryjmlgkonufvza\n" +
                    "oiwnwpbseqhxtyfmlgktnujvza\n" +
                    "oiwcypbseqhxryfmlgetnujvzv\n" +
                    "oiwcdpbseqhxryqmljktnkjvza\n" +
                    "olwcdpbseqhxryfmlgkenujvba\n" +
                    "biwcdpbseqwxrywmlgktnujvza\n" +
                    "oiwcdpbsevhmryjmlgktnujvza\n" +
                    "oiwcdpbseqhxryfmlzktnkjvzv\n" +
                    "oiwudpbseqhxrefmlgktnujvia\n" +
                    "oiicdpbseqhxryfdloktnujvza\n" +
                    "oihcjpbsxqhxryfmlgktnujvza\n" +
                    "</p>" +
                    "<p> MERRY CODING </p>")))
    }



    override fun onDestroy() {
        super.onDestroy()
    }


}

