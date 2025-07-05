package com.example.thirtydays.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.thirtydays.R

data class Day(
    @StringRes val dayRes: Int,
    @StringRes val titleRes: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val contentRes: Int
)

object DaysRepository {
    val days = listOf(
        Day(
            dayRes = R.string.day1,
            titleRes = R.string.title_day1,
            imageRes = R.drawable.image_1,
            contentRes = R.string.content_day1
        ),
        Day(
            dayRes = R.string.day2,
            titleRes = R.string.title_day2,
            imageRes = R.drawable.image_2,
            contentRes = R.string.content_day2
        ),
        Day(
            dayRes = R.string.day3,
            titleRes = R.string.title_day3,
            imageRes = R.drawable.image_3,
            contentRes = R.string.content_day3
        ),
        Day(
            dayRes = R.string.day4,
            titleRes = R.string.title_day4,
            imageRes = R.drawable.image_4,
            contentRes = R.string.content_day4
        ),
        Day(
            dayRes = R.string.day5,
            titleRes = R.string.title_day5,
            imageRes = R.drawable.image_5,
            contentRes = R.string.content_day2
        ),
        Day(
            dayRes = R.string.day6,
            titleRes = R.string.title_day6,
            imageRes = R.drawable.image_6,
            contentRes = R.string.content_day6
        ),
        Day(
            dayRes = R.string.day7,
            titleRes = R.string.title_day7,
            imageRes = R.drawable.image_7,
            contentRes = R.string.content_day7
        ),
        Day(
            dayRes = R.string.day8,
            titleRes = R.string.title_day8,
            imageRes = R.drawable.image_8,
            contentRes = R.string.content_day8
        ),
        Day(
            dayRes = R.string.day9,
            titleRes = R.string.title_day9,
            imageRes = R.drawable.image_9,
            contentRes = R.string.content_day9
        ),
        Day(
            dayRes = R.string.day10,
            titleRes = R.string.title_day10,
            imageRes = R.drawable.image_10,
            contentRes = R.string.content_day10
        ),
        Day(
            dayRes = R.string.day11,
            titleRes = R.string.title_day11,
            imageRes = R.drawable.image_11,
            contentRes = R.string.content_day11
        ),
        Day(
            dayRes = R.string.day12,
            titleRes = R.string.title_day12,
            imageRes = R.drawable.image_12,
            contentRes = R.string.content_day12
        ),
        Day(
            dayRes = R.string.day13,
            titleRes = R.string.title_day13,
            imageRes = R.drawable.image_13,
            contentRes = R.string.content_day13
        ),
        Day(
            dayRes = R.string.day14,
            titleRes = R.string.title_day14,
            imageRes = R.drawable.image_14,
            contentRes = R.string.content_day14
        ),
        Day(
            dayRes = R.string.day15,
            titleRes = R.string.title_day15,
            imageRes = R.drawable.image_15,
            contentRes = R.string.content_day15
        ),
        Day(
            dayRes = R.string.day16,
            titleRes = R.string.title_day16,
            imageRes = R.drawable.image_16,
            contentRes = R.string.content_day16
        ),
        Day(
            dayRes = R.string.day17,
            titleRes = R.string.title_day17,
            imageRes = R.drawable.image_17,
            contentRes = R.string.content_day17
        ),
        Day(
            dayRes = R.string.day18,
            titleRes = R.string.title_day18,
            imageRes = R.drawable.image_18,
            contentRes = R.string.content_day18
        ),
        Day(
            dayRes = R.string.day19,
            titleRes = R.string.title_day19,
            imageRes = R.drawable.image_19,
            contentRes = R.string.content_day19
        ),
        Day(
            dayRes = R.string.day20,
            titleRes = R.string.title_day20,
            imageRes = R.drawable.image_20,
            contentRes = R.string.content_day20
        ),
        Day(
            dayRes = R.string.day21,
            titleRes = R.string.title_day21,
            imageRes = R.drawable.image_21,
            contentRes = R.string.content_day21
        ),
        Day(
            dayRes = R.string.day22,
            titleRes = R.string.title_day22,
            imageRes = R.drawable.image_22,
            contentRes = R.string.content_day22
        ),
        Day(
            dayRes = R.string.day23,
            titleRes = R.string.title_day23,
            imageRes = R.drawable.image_23,
            contentRes = R.string.content_day23
        ),
        Day(
            dayRes = R.string.day24,
            titleRes = R.string.title_day24,
            imageRes = R.drawable.image_24,
            contentRes = R.string.content_day24
        ),
        Day(
            dayRes = R.string.day25,
            titleRes = R.string.title_day25,
            imageRes = R.drawable.image_25,
            contentRes = R.string.content_day25
        ),
        Day(
            dayRes = R.string.day26,
            titleRes = R.string.title_day26,
            imageRes = R.drawable.image_26,
            contentRes = R.string.content_day26
        ),
        Day(
            dayRes = R.string.day27,
            titleRes = R.string.title_day27,
            imageRes = R.drawable.image_27,
            contentRes = R.string.content_day27
        ),
        Day(
            dayRes = R.string.day28,
            titleRes = R.string.title_day28,
            imageRes = R.drawable.image_28,
            contentRes = R.string.content_day28
        ),
        Day(
            dayRes = R.string.day29,
            titleRes = R.string.title_day29,
            imageRes = R.drawable.image_29,
            contentRes = R.string.content_day29
        ),
        Day(
            dayRes = R.string.day30,
            titleRes = R.string.title_day30,
            imageRes = R.drawable.image_30,
            contentRes = R.string.content_day30
        ),
    )
}