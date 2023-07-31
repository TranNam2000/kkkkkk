package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pieChart: PieChart = findViewById(R.id.pieChart)

        // Tạo danh sách các phần tử cho biểu đồ tròn
        val entries = ArrayList<PieEntry>()
        entries.add(PieEntry(30f, "Dữ liệu 1"))
        entries.add(PieEntry(20f, "Dữ liệu 2"))
        entries.add(PieEntry(50f, "Dữ liệu 3"))

        // Tạo một bộ dữ liệu
        val dataSet = PieDataSet(entries, "Dữ liệu biểu đồ tròn")

        // Cấu hình màu sắc cho các phần tử trong biểu đồ tròn
        val colors = ArrayList<Int>()
        colors.add(Color.RED)
        colors.add(Color.BLUE)
        colors.add(Color.GREEN)
        dataSet.colors = colors

        // Tạo đối tượng dữ liệu từ bộ dữ liệu
        val pieData = PieData(dataSet)

        // Cấu hình các thuộc tính của biểu đồ tròn
        pieChart.data = pieData
        pieChart.setEntryLabelColor(Color.BLACK)
        pieChart.centerText = "Biểu đồ tròn thể hiện cơ cấu " // Văn bản ở giữa biểu đồ
        pieChart.setUsePercentValues(true)
        pieChart.setEntryLabelColor(Color.WHITE)
        pieChart.setHoleColor(Color.TRANSPARENT) // Màu của lỗ giữa biểu đồ (mặc định là trắng)
        pieChart.description.isEnabled = false // Vô hiệu hóa miêu tả của biểu đồ

         pieChart.invalidate()
    }

}