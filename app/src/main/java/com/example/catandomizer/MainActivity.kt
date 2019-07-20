package com.example.catandomizer

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import android.support.v4.widget.DrawerLayout
import android.support.design.widget.NavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.ListAdapter
import kotlinx.android.synthetic.main.content_main.*
import java.util.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    companion object {
        var desert4 = 1
        var desert6 = 2
        var ore4 = 3
        var ore6 = 5
        var wheat4 = 4
        var wheat6 = 6
        var brick4 = 3
        var brick6 = 5
        var lumber4 = 4
        var lumber6 = 6
        var sheep4 = 4
        var sheep6 = 6
        var two4 = 1
        var three4 = 2
        var four4 = 2
        var five4 = 2
        var six4 = 2
        var eight4 = 2
        var nine4 = 2
        var ten4 = 2
        var eleven4 = 2
        var twelve4 = 1
        var two6 = 2
        var three6 = 3
        var four6 = 3
        var five6 = 3
        var six6 = 3
        var eight6 = 3
        var nine6 = 3
        var ten6 = 3
        var eleven6 = 3
        var twelve6 = 2
        var masterType = mutableListOf<String>()
        var masterNums = mutableListOf<Int>()
        var masterList = arrayOf(masterType, masterNums)
        val Brick = R.drawable.brick
        val Desert = R.drawable.desert
        val Lumber = R.drawable.lumber
        val Ore = R.drawable.ore
        val Sheep = R.drawable.grass
        val Wheat = R.drawable.wheat
        val Blank = R.drawable.blank
        val o2 = R.drawable.o2
        val o3 = R.drawable.o3
        val o4 = R.drawable.o4
        val o5 = R.drawable.o5
        val o6 = R.drawable.o6
        val o8 = R.drawable.o8
        val o9 = R.drawable.o9
        val o10 = R.drawable.o10
        val o11 = R.drawable.o11
        val o12 = R.drawable.o12

    }

    fun randomize(){
        if (!expansion.isChecked){
            r4p()
        }
        else{
            r6p()
        }

    }

    fun r4p(){
        var d = desert4
        var o = ore4
        var w = wheat4
        var b = brick4
        var l = lumber4
        var s = sheep4
        var types = mutableListOf<Int>(Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank,
            Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank)
        var two = two4
        var three = three4
        var four = four4
        var five = five4
        var six = six4
        var eight = eight4
        var nine = nine4
        var ten = ten4
        var eleven = eleven4
        var twelve = twelve4
        var nums = mutableListOf<Int>(Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank,
            Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank)

        while (d > 0){
            var tempRandom = Random().nextInt(19)
            if(types[tempRandom] == Blank) {
                types[tempRandom] = Desert
                d--
            }
        }
        while (o > 0){
            var tempRandom = Random().nextInt(19)
            if(types[tempRandom] == Blank) {
                types[tempRandom] = Ore
                o--
            }
        }
        while (w > 0){
            var tempRandom = Random().nextInt(19)
            if(types[tempRandom] == Blank) {
                types[tempRandom] = Wheat
                w--
            }
        }
        while (b > 0){
            var tempRandom = Random().nextInt(19)
            if(types[tempRandom] == Blank) {
                types[tempRandom] = Brick
                b--
            }
        }
        while (l > 0){
            var tempRandom = Random().nextInt(19)
            if(types[tempRandom] == Blank) {
                types[tempRandom] = Lumber
                l--
            }
        }
        while (s > 0) {
            var tempRandom = Random().nextInt(19)
            if (types[tempRandom] == Blank) {
                types[tempRandom] = Sheep
                s--
            }
        }
        while (two > 0){
            var tempRandom = Random().nextInt(19)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o2
                two--
            }
        }
        while (three > 0){
            var tempRandom = Random().nextInt(19)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o3
                three--
            }
        }
        while (four > 0){
            var tempRandom = Random().nextInt(19)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o4
                four--
            }
        }
        while (five > 0){
            var tempRandom = Random().nextInt(19)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o5
                five--
            }
        }
        while (six > 0){
            var tempRandom = Random().nextInt(19)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o6
                six--
            }
        }
        while (eight > 0){
            var tempRandom = Random().nextInt(19)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o8
                eight--
            }
        }
        while (nine > 0){
            var tempRandom = Random().nextInt(19)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o9
                nine--
            }
        }
        while (ten > 0){
            var tempRandom = Random().nextInt(19)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o10
                ten--
            }
        }
        while (eleven > 0){
            var tempRandom = Random().nextInt(19)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o11
                eleven--
            }
        }
        while (twelve > 0){
            var tempRandom = Random().nextInt(19)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o12
                twelve--
            }
        }
        masterList[0] = types
        masterList[1] = nums
        map0.setImageResource(types[0])
        map1.setImageResource(types[1])
        map2.setImageResource(types[2])
        map3.setImageResource(types[3])
        map4.setImageResource(types[4])
        map5.setImageResource(types[5])
        map6.setImageResource(types[6])
        map7.setImageResource(types[7])
        map8.setImageResource(types[8])
        map9.setImageResource(types[9])
        map10.setImageResource(types[10])
        map11.setImageResource(types[11])
        map12.setImageResource(types[12])
        map13.setImageResource(types[13])
        map14.setImageResource(types[14])
        map15.setImageResource(types[15])
        map16.setImageResource(types[16])
        map17.setImageResource(types[17])
        map18.setImageResource(types[18])
        map19.setImageResource(Blank)
        map20.setImageResource(Blank)
        map21.setImageResource(Blank)
        map22.setImageResource(Blank)
        map23.setImageResource(Blank)
        map24.setImageResource(Blank)
        map25.setImageResource(Blank)
        map26.setImageResource(Blank)
        map27.setImageResource(Blank)
        map28.setImageResource(Blank)
        map29.setImageResource(Blank)

        num0.setImageResource(nums[0])
        num1.setImageResource(nums[1])
        num2.setImageResource(nums[2])
        num3.setImageResource(nums[3])
        num4.setImageResource(nums[4])
        num5.setImageResource(nums[5])
        num6.setImageResource(nums[6])
        num7.setImageResource(nums[7])
        num8.setImageResource(nums[8])
        num9.setImageResource(nums[9])
        num10.setImageResource(nums[10])
        num11.setImageResource(nums[11])
        num12.setImageResource(nums[12])
        num13.setImageResource(nums[13])
        num14.setImageResource(nums[14])
        num15.setImageResource(nums[15])
        num16.setImageResource(nums[16])
        num17.setImageResource(nums[17])
        num18.setImageResource(nums[18])
        num19.setImageResource(Blank)
        num20.setImageResource(Blank)
        num21.setImageResource(Blank)
        num22.setImageResource(Blank)
        num23.setImageResource(Blank)
        num24.setImageResource(Blank)
        num25.setImageResource(Blank)
        num26.setImageResource(Blank)
        num27.setImageResource(Blank)
        num28.setImageResource(Blank)
        num29.setImageResource(Blank)
    }

    fun r6p(){
        var d = desert6
        var o = ore6
        var w = wheat6
        var b = brick6
        var l = lumber6
        var s = sheep6
        var types = mutableListOf<Int>(Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank,
            Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank,
            Blank, Blank, Blank, Blank, Blank, Blank)
        var two = two6
        var three = three6
        var four = four6
        var five = five6
        var six = six6
        var eight = eight6
        var nine = nine6
        var ten = ten6
        var eleven = eleven6
        var twelve = twelve6
        var nums = mutableListOf<Int>(Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank,
            Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank, Blank,
            Blank, Blank, Blank, Blank, Blank, Blank)
        while (d > 0){
            var tempRandom = Random().nextInt(30)
            if(types[tempRandom] == Blank) {
                types[tempRandom] = Desert
                d--
            }
        }
        while (o > 0){
            var tempRandom = Random().nextInt(30)
            if(types[tempRandom] == Blank) {
                types[tempRandom] = Ore
                o--
            }
        }
        while (w > 0){
            var tempRandom = Random().nextInt(30)
            if(types[tempRandom] == Blank) {
                types[tempRandom] = Wheat
                w--
            }
        }
        while (b > 0){
            var tempRandom = Random().nextInt(30)
            if(types[tempRandom] == Blank) {
                types[tempRandom] = Brick
                b--
            }
        }
        while (l > 0){
            var tempRandom = Random().nextInt(30)
            if(types[tempRandom] == Blank) {
                types[tempRandom] = Lumber
                l--
            }
        }
        while (s > 0) {
            var tempRandom = Random().nextInt(30)
            if (types[tempRandom] == Blank) {
                types[tempRandom] = Sheep
                s--
            }
        }
        while (two > 0){
            var tempRandom = Random().nextInt(30)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o2
                two--
            }
        }
        while (three > 0){
            var tempRandom = Random().nextInt(30)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o3
                three--
            }
        }
        while (four > 0){
            var tempRandom = Random().nextInt(30)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o4
                four--
            }
        }
        while (five > 0){
            var tempRandom = Random().nextInt(30)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o5
                five--
            }
        }
        while (six > 0){
            var tempRandom = Random().nextInt(30)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o6
                six--
            }
        }
        while (eight > 0){
            var tempRandom = Random().nextInt(30)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o8
                eight--
            }
        }
        while (nine > 0){
            var tempRandom = Random().nextInt(30)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o9
                nine--
            }
        }
        while (ten > 0){
            var tempRandom = Random().nextInt(30)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o10
                ten--
            }
        }
        while (eleven > 0){
            var tempRandom = Random().nextInt(30)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o11
                eleven--
            }
        }
        while (twelve > 0){
            var tempRandom = Random().nextInt(30)
            if(nums[tempRandom] == Blank && types[tempRandom] != Desert){
                nums[tempRandom] = o12
                twelve--
            }
        }

        map0.setImageResource(types[0])
        map1.setImageResource(types[1])
        map2.setImageResource(types[2])
        map3.setImageResource(types[3])
        map4.setImageResource(types[4])
        map5.setImageResource(types[5])
        map6.setImageResource(types[6])
        map7.setImageResource(types[7])
        map8.setImageResource(types[8])
        map9.setImageResource(types[9])
        map10.setImageResource(types[10])
        map11.setImageResource(types[11])
        map12.setImageResource(types[12])
        map13.setImageResource(types[13])
        map14.setImageResource(types[14])
        map15.setImageResource(types[15])
        map16.setImageResource(types[16])
        map17.setImageResource(types[17])
        map18.setImageResource(types[18])
        map19.setImageResource(types[19])
        map20.setImageResource(types[20])
        map21.setImageResource(types[21])
        map22.setImageResource(types[22])
        map23.setImageResource(types[23])
        map24.setImageResource(types[24])
        map25.setImageResource(types[25])
        map26.setImageResource(types[26])
        map27.setImageResource(types[27])
        map28.setImageResource(types[28])
        map29.setImageResource(types[29])


        num0.setImageResource(nums[0])
        num1.setImageResource(nums[1])
        num2.setImageResource(nums[2])
        num3.setImageResource(nums[3])
        num4.setImageResource(nums[4])
        num5.setImageResource(nums[5])
        num6.setImageResource(nums[6])
        num7.setImageResource(nums[7])
        num8.setImageResource(nums[8])
        num9.setImageResource(nums[9])
        num10.setImageResource(nums[10])
        num11.setImageResource(nums[11])
        num12.setImageResource(nums[12])
        num13.setImageResource(nums[13])
        num14.setImageResource(nums[14])
        num15.setImageResource(nums[15])
        num16.setImageResource(nums[16])
        num17.setImageResource(nums[17])
        num18.setImageResource(nums[18])
        num19.setImageResource(nums[19])
        num20.setImageResource(nums[20])
        num21.setImageResource(nums[21])
        num22.setImageResource(nums[22])
        num23.setImageResource(nums[23])
        num24.setImageResource(nums[24])
        num25.setImageResource(nums[25])
        num26.setImageResource(nums[26])
        num27.setImageResource(nums[27])
        num28.setImageResource(nums[28])
        num29.setImageResource(nums[29])


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        button.setOnClickListener {
            randomize()
        }

        /*
        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setImageResource(Blank)

        fab.setOnClickListener{
            randomize()
        }
        */

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)

    }

    override fun onBackPressed() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_home -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_tools -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}
