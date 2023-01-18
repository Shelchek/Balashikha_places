package com.example.balashikhaplaces.data

import com.example.balashikhaplaces.R

enum class Categories {
    PHARMACY,
    HOSPITAL,
    SPORT,
    RESTAURANT_CAFFE,
    PARK
}

val places = mapOf(
    Categories.HOSPITAL to listOf(
        Place(
            name = R.string.hosp_2Neurological_name,
            address = R.string.hosp_2Neurological_address,
            description = R.string.hosp_2Neurological_description,
            picture = R.drawable.hosp_2nevrol,
            schedule = listOf(
                "get lucky",
                "get lucky",
                "get lucky",
                "get lucky",
                "get lucky",
                "get lucky",
                "get lucky"
            )
        ),
        Place(
            name = R.string.hosp_PlyclinicNumber1_name,
            address = R.string.hosp_PlyclinicNumber1_address,
            description = R.string.hosp_PlyclinicNumber1_description,
            picture = R.drawable.hosp_policlinika1,
            schedule = listOf(
                "08:00 – 20:00",
                "08:00 – 20:00",
                "08:00 – 20:00",
                "08:00 – 20:00",
                "08:00 – 20:00",
                "Off",
                "Off"
            )
        ),
        Place(
            name = R.string.hosp_regionalBranch1_name,
            address = R.string.hosp_regionalBranch1_address,
            description = R.string.hosp_regionalBranch1_description,
            picture = R.drawable.hosp_oblastbranch1,
            schedule = listOf(
                "whole day",
                "whole day",
                "whole day",
                "whole day",
                "whole day",
                "whole day",
                "whole day",
            )
        )
    ),
    Categories.PHARMACY to listOf(
        Place(
            name = R.string.ph_Dialog_name,
            address = R.string.ph_Dialog_address,
            description = R.string.ph_Dialog_description,
            picture = R.drawable.pharm_dialog,
            schedule = listOf(
                "08:00 – 23:00",
                "08:00 – 23:00",
                "08:00 – 23:00",
                "08:00 – 23:00",
                "08:00 – 23:00",
                "08:00 – 23:00",
                "08:00 – 23:00",
            )
        ),
        Place(
            name = R.string.ph_Zdorov_ru_name,
            address = R.string.ph_Zdorov_ru_address,
            description = R.string.ph_Zdorov_ru_description,
            picture = R.drawable.pharm_zdorov_ru,
            schedule = listOf(
                "07:00 – 23:00",
                "07:00 – 23:00",
                "07:00 – 23:00",
                "07:00 – 23:00",
                "07:00 – 23:00",
                "07:00 – 23:00",
                "07:00 – 23:00",
            )
        ),
        Place(
            name = R.string.ph_36_6_name,
            address = R.string.ph_36_6_address,
            description = R.string.ph_36_6_description,
            picture = R.drawable.pharm_36_6,
            schedule = listOf(
                "10:00 – 22:00",
                "10:00 – 22:00",
                "10:00 – 22:00",
                "10:00 – 22:00",
                "10:00 – 22:00",
                "10:00 – 22:00",
                "10:00 – 22:00",
            )
        )
    ),
    Categories.SPORT to listOf(
        Place(
            name = R.string.sport_Neptun_name,
            address = R.string.sport_Neptun_address,
            description = R.string.sport_Neptun_description,
            picture = R.drawable.sport_neptun,
            schedule = listOf(
                "06:45 – 23:00",
                "06:45 – 23:00",
                "06:45 – 23:00",
                "06:45 – 23:00",
                "06:45 – 23:00",
                "06:45 – 23:00",
                "08:00 – 22:00"
            )
        ),
        Place(
            name = R.string.sport_Ageev_name,
            address = R.string.sport_Ageev_address,
            description = R.string.sport_Ageev_description,
            picture = R.drawable.sport_ageev,
            schedule = listOf(
                "09:00 – 23:00",
                "09:00 – 23:00",
                "09:00 – 23:00",
                "09:00 – 23:00",
                "09:00 – 23:00",
                "09:00 – 15:00",
                "09:00 – 15:00"
            )
        ),
        Place(
            name = R.string.sport_Meteor_name,
            address = R.string.sport_Meteor_address,
            description = R.string.sport_Meteor_description,
            picture = R.drawable.sport_meteor,
            schedule = listOf(
                "09:00 – 22:00",
                "09:00 – 22:00",
                "09:00 – 22:00",
                "09:00 – 22:00",
                "09:00 – 22:00",
                "09:00 – 22:00",
                "09:00 – 22:00",
            )
        )
    ),
    Categories.RESTAURANT_CAFFE to listOf(
        Place(
            name = R.string.caffe_ILPatio_name,
            address = R.string.caffe_ILPatio_address,
            description = R.string.caffe_ILPatio_description,
            picture = R.drawable.caffe_elpatio,
            schedule = listOf(
                "12:00 – 23:00",
                "12:00 – 23:00",
                "12:00 – 23:00",
                "12:00 – 23:00",
                "12:00 – 23:00",
                "12:00 – 23:00",
                "12:00 – 23:00",
            )
        ),
        Place(
            name = R.string.caffe_Gastropapy_name,
            address = R.string.caffe_Gastropapy_address,
            description = R.string.caffe_Gastropapy_description,
            picture = R.drawable.caffe_gastropapy,
            schedule = listOf(
                "11:00 – 22:00",
                "11:00 – 22:00",
                "11:00 – 22:00",
                "11:00 – 22:00",
                "11:00 – 23:00",
                "11:00 – 23:00",
                "11:00 – 22:00"
            )
        ),
        Place(
            name = R.string.caffe_Tanuki_name,
            address = R.string.caffe_Tanuki_address,
            description = R.string.caffe_Tanuki_description,
            picture = R.drawable.caffe_tanuki,
            schedule = listOf(
                "11:30 – 00:00",
                "11:30 – 00:00",
                "11:30 – 00:00",
                "11:30 – 00:00",
                "11:30 – 00:00",
                "11:30 – 00:00",
                "11:30 – 00:00",
            )
        )
    ),
    Categories.PARK to listOf(
        Place(
            name = R.string.park_Pehorka_name,
            address = R.string.park_Pehorka_address,
            description = R.string.park_Pehorka_description,
            picture = R.drawable.park_pehorka,
            schedule = listOf(
                "05:00 – 00:00",
                "05:00 – 00:00",
                "05:00 – 00:00",
                "05:00 – 00:00",
                "05:00 – 00:00",
                "05:00 – 00:00",
                "05:00 – 00:00",
            )
        ),
        Place(
            name = R.string.park_Golitsyn_name,
            address = R.string.park_Golitsyn_address,
            description = R.string.park_Golitsyn_description,
            picture = R.drawable.park_golitsin,
            schedule = listOf(
                "whole day",
                "whole day",
                "whole day",
                "whole day",
                "whole day",
                "whole day",
                "whole day",
            )
        ),
        Place(
            name = R.string.park_Gorensky_name,
            address = R.string.park_Gorensky_address,
            description = R.string.park_Gorensky_description,
            picture = R.drawable.park_gorenky,
            schedule = listOf(
                "whole day",
                "whole day",
                "whole day",
                "whole day",
                "whole day",
                "whole day",
                "whole day",
            )
        )
    )
)