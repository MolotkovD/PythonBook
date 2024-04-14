package ru.rudnsochi.pythonbook

import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import android.webkit.WebView
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var drawerLayout : DrawerLayout
    lateinit var mainWeb : WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.main)
        mainWeb = findViewById(R.id.mainWeb)


        val toolBar : Toolbar = findViewById(R.id.headtoolbar)
        setSupportActionBar(toolBar)

        val navigationView : NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this, drawerLayout, toolBar, R.string.open_nav, R.string.close_nav)

        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        mainWeb.setBackgroundColor(Color.TRANSPARENT)
        mainWeb.loadUrl("file:///android_asset/Глава 1. Введение в язык Kotlin/1. Что такое Kotlin. Первая программа.html")

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var newurl : String = "file:///android_asset/Глава 1. Введение в язык Kotlin/1. Что такое Kotlin. Первая программа.html"


        when(item.itemId){
            R.id.tab1 -> newurl =  "file:///android_asset/Глава 1. Введение в язык Kotlin/1. Что такое Kotlin. Первая программа.html"
            R.id.tab2 -> newurl  = "file:///android_asset/Глава 1. Введение в язык Kotlin/2. Первая программа на Kotlin в IntelliJ IDEA.html"

            R.id.tab3 -> newurl  = "file:///android_asset/Глава 2. Основы языка Kotlin/1. Структура программы.html"
            R.id.tab4 -> newurl  = "file:///android_asset/Глава 2. Основы языка Kotlin/2. Переменные.html"
            R.id.tab5 -> newurl  = "file:///android_asset/Глава 2. Основы языка Kotlin/3. Типы данных.html"
            R.id.tab6 -> newurl  = "file:///android_asset/Глава 2. Основы языка Kotlin/4. Консольный ввод и вывод.html"
            R.id.tab7 -> newurl  = "file:///android_asset/Глава 2. Основы языка Kotlin/5. Операции с числами.html"
            R.id.tab8 -> newurl  = "file:///android_asset/Глава 2. Основы языка Kotlin/6. Условные выражения.html"
            R.id.tab9 -> newurl  = "file:///android_asset/Глава 2. Основы языка Kotlin/7. Условная конструкция if...else.html"
            R.id.tab10 -> newurl = "file:///android_asset/Глава 2. Основы языка Kotlin/8. Конструкция when.html"
            R.id.tab11 -> newurl = "file:///android_asset/Глава 2. Основы языка Kotlin/9. Циклы.html"
            R.id.tab12 -> newurl = "file:///android_asset/Глава 2. Основы языка Kotlin/10. Диапазоны.html"
            R.id.tab13 -> newurl = "file:///android_asset/Глава 2. Основы языка Kotlin/11. Ведение в массивы.html"

            R.id.tab14 -> newurl = "file:///android_asset/Глава 3. Функциональное программирование/1. Функции и их параметры.html"
            R.id.tab15 -> newurl = "file:///android_asset/Глава 3. Функциональное программирование/2. Переменное количество параметров. Vararg.html"
            R.id.tab16 -> newurl = "file:///android_asset/Глава 3. Функциональное программирование/3. Возвращение результата. Оператор return.html"
            R.id.tab17 -> newurl = "file:///android_asset/Глава 3. Функциональное программирование/4. Однострочные и локальные функции.html"
            R.id.tab18 -> newurl = "file:///android_asset/Глава 3. Функциональное программирование/5. Перегрузка функций.html"
            R.id.tab19 -> newurl = "file:///android_asset/Глава 3. Функциональное программирование/6. Тип функции.html"
            R.id.tab20 -> newurl = "file:///android_asset/Глава 3. Функциональное программирование/7. Функции высокого порядка.html"
            R.id.tab21 -> newurl = "file:///android_asset/Глава 3. Функциональное программирование/8. Анонимные функции.html"
            R.id.tab22 -> newurl = "file:///android_asset/Глава 3. Функциональное программирование/9. Лямбда-выражения.html"
            R.id.tab23 -> newurl = "file:///android_asset/Глава 3. Функциональное программирование/10. Замыкания.html"

            R.id.tab24 -> newurl = "file:///android_asset/Глава 4. Объектно-ориентированное программирование/1. Классы и объекты.html"
            R.id.tab25 -> newurl = "file:///android_asset/Глава 4. Объектно-ориентированное программирование/2. Конструкторы.html"
            R.id.tab26 -> newurl = "file:///android_asset/Глава 4. Объектно-ориентированное программирование/3. Пакеты и импорт.html"
            R.id.tab27 -> newurl = "file:///android_asset/Глава 4. Объектно-ориентированное программирование/4. Наследование.html"
            R.id.tab28 -> newurl = "file:///android_asset/Глава 4. Объектно-ориентированное программирование/5. Модификаторы видимости.html"
            R.id.tab29 -> newurl = "file:///android_asset/Глава 4. Объектно-ориентированное программирование/6. Геттеры и сеттеры.html"
            R.id.tab30 -> newurl = "file:///android_asset/Глава 4. Объектно-ориентированное программирование/7. Переопределение методов и свойств.html"
            R.id.tab31 -> newurl = "file:///android_asset/Глава 4. Объектно-ориентированное программирование/8. Абстрактные классы и методы.html"
            R.id.tab32 -> newurl = "file:///android_asset/Глава 4. Объектно-ориентированное программирование/9. Интерфейсы.html"
            R.id.tab33 -> newurl = "file:///android_asset/Глава 4. Объектно-ориентированное программирование/10. Вложенные и внутренние классы и интерфейсы.html"
            R.id.tab34 -> newurl = "file:///android_asset/Глава 4. Объектно-ориентированное программирование/11. Data-классы.html"
            R.id.tab35 -> newurl = "file:///android_asset/Глава 4. Объектно-ориентированное программирование/12. Перечисления enums.html"
            R.id.tab36 -> newurl = "file:///android_asset/Глава 4. Объектно-ориентированное программирование/13. Делегирование.html"
            R.id.tab37 -> newurl = "file:///android_asset/Глава 4. Объектно-ориентированное программирование/14. Анонимные классы и объекты.html"
            R.id.tab38 -> newurl = "file:///android_asset/Глава 4. Объектно-ориентированное программирование/15. Companion-объекты.html"

            R.id.tab39 -> newurl = "file:///android_asset/Глава 5. Обобщения/1. Обобщенные классы и функции.html"
            R.id.tab40 -> newurl = "file:///android_asset/Глава 5. Обобщения/2. Ограничения обобщений.html"
            R.id.tab41 -> newurl = "file:///android_asset/Глава 5. Обобщения/3. Вариантность, ковариантность и контравариантность.html"

            R.id.tab42 -> newurl = "file:///android_asset/Глава 6. Дополнительные возможности ООП/1. Обработка исключений.html"
            R.id.tab43 -> newurl = "file:///android_asset/Глава 6. Дополнительные возможности ООП/2. Null и nullable-типы.html"
            R.id.tab44 -> newurl = "file:///android_asset/Глава 6. Дополнительные возможности ООП/3. Преобразование типов.html"
            R.id.tab45 -> newurl = "file:///android_asset/Глава 6. Дополнительные возможности ООП/4. Функции расширения.html"
            R.id.tab46 -> newurl = "file:///android_asset/Глава 6. Дополнительные возможности ООП/5. Перегрузка операторов.html"
            R.id.tab47 -> newurl = "file:///android_asset/Глава 6. Дополнительные возможности ООП/6. Делегированные свойства.html"
            R.id.tab48 -> newurl = "file:///android_asset/Глава 6. Дополнительные возможности ООП/7. Scope-функции.html"
            R.id.tab49 -> newurl = "file:///android_asset/Глава 6. Дополнительные возможности ООП/8. Инфиксная нотация.html"

            R.id.tab50 -> newurl = "file:///android_asset/Глава 7. Коллекции и последовательности/1. Изменяемые и неизменяемые коллекции.html"
            R.id.tab51 -> newurl = "file:///android_asset/Глава 7. Коллекции и последовательности/2. List.html"
            R.id.tab52 -> newurl = "file:///android_asset/Глава 7. Коллекции и последовательности/3. Set.html"
            R.id.tab53 -> newurl = "file:///android_asset/Глава 7. Коллекции и последовательности/4. Map.html"
            R.id.tab54 -> newurl = "file:///android_asset/Глава 7. Коллекции и последовательности/5. Последовательности.html"
            R.id.tab55 -> newurl = "file:///android_asset/Глава 7. Коллекции и последовательности/6. Массивы.html"
            R.id.tab56 -> newurl = "file:///android_asset/Глава 7. Коллекции и последовательности/7. Отличие последовательности от коллекций Iterable.html"
            R.id.tab57 -> newurl = "file:///android_asset/Глава 7. Коллекции и последовательности/8. Фильтрация.html"
            R.id.tab58 -> newurl = "file:///android_asset/Глава 7. Коллекции и последовательности/9. Проверка элементов.html"
            R.id.tab59 -> newurl = "file:///android_asset/Глава 7. Коллекции и последовательности/10. Трансформации.html"
            R.id.tab60 -> newurl = "file:///android_asset/Глава 7. Коллекции и последовательности/11. Группировка.html"
            R.id.tab61 -> newurl = "file:///android_asset/Глава 7. Коллекции и последовательности/12. Сортировка.html"
            R.id.tab62 -> newurl = "file:///android_asset/Глава 7. Коллекции и последовательности/13. Агрегатные операции.html"
            R.id.tab63 -> newurl = "file:///android_asset/Глава 7. Коллекции и последовательности/14. Сложение, вычитание и объединение коллекций.html"
            R.id.tab64 -> newurl = "file:///android_asset/Глава 7. Коллекции и последовательности/15. Получение части элементов.html"
            R.id.tab65 -> newurl = "file:///android_asset/Глава 7. Коллекции и последовательности/16. Получение отдельных элементов.html"

            R.id.tab66 -> newurl = "file:///android_asset/Глава 8. Корутины/1. Введение в корутины.html"
            R.id.tab67 -> newurl = "file:///android_asset/Глава 8. Корутины/2. Область корутины.html"
            R.id.tab68 -> newurl = "file:///android_asset/Глава 8. Корутины/3. launch и Job.html"
            R.id.tab69 -> newurl = "file:///android_asset/Глава 8. Корутины/4. Async, await и Deferred.html"
            R.id.tab70 -> newurl = "file:///android_asset/Глава 8. Корутины/5. Диспетчер корутины.html"
            R.id.tab71 -> newurl = "file:///android_asset/Глава 8. Корутины/6. Отмена выполнения корутин.html"
            R.id.tab72 -> newurl = "file:///android_asset/Глава 8. Корутины/7. Каналы.html"

            R.id.tab73 -> newurl = "file:///android_asset/Глава 9. Асинхронные потоки/1. Введение в асинхронные потоки.html"
            R.id.tab74 -> newurl = "file:///android_asset/Глава 9. Асинхронные потоки/2. Создание асинхронного потока.html"
            R.id.tab75 -> newurl = "file:///android_asset/Глава 9. Асинхронные потоки/3. Операции с потоками.html"
            R.id.tab76 -> newurl = "file:///android_asset/Глава 9. Асинхронные потоки/4. Функции count, take и drop. Количество элементов в потоке.html"
            R.id.tab77 -> newurl = "file:///android_asset/Глава 9. Асинхронные потоки/5. Функции first, last, single.html"
            R.id.tab78 -> newurl = "file:///android_asset/Глава 9. Асинхронные потоки/6. Преобразование данных. Функции map и transform.html"
            R.id.tab79 -> newurl = "file:///android_asset/Глава 9. Асинхронные потоки/7. Фильтрация данных.html"
            R.id.tab80 -> newurl = "file:///android_asset/Глава 9. Асинхронные потоки/8. Сведение данных. Функции reduce и fold.html"
            R.id.tab81 -> newurl = "file:///android_asset/Глава 9. Асинхронные потоки/9. Объединение потоков.html"

        }

        mainWeb.loadUrl(newurl)

        item.setChecked(true)

        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }


}