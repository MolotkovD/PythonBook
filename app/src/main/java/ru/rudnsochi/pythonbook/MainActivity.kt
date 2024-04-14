package ru.rudnsochi.pythonbook

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout : DrawerLayout = findViewById(R.id.main)


        val toolBar : Toolbar = findViewById(R.id.headtoolbar)
        setSupportActionBar(toolBar)

        val nav = findViewById<NavigationView>(R.id.nav_view)
        nav.setNavigationItemSelectedListener(this)

        val toogle = ActionBarDrawerToggle(this, drawerLayout,
            toolBar, R.string.open_nav, R.string.close_nav)

        drawerLayout.addDrawerListener(toogle)
        toogle.syncState()
    }

    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        println(p0.itemId)
        return true
    }
}