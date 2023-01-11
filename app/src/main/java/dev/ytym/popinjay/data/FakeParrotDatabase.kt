/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.ytym.popinjay.data

import dev.ytym.popinjay.R
import dev.ytym.popinjay.ui.theme.model.Parrot

object FakeParrotDatabase {
    val parrotLists = listOf(
        Parrot(
            0,
            "Cloudy",
            1.1,
            "Female",
            "Light Blue",
            115.0,
            R.drawable.lblue_p,
            "It is the smallest bird of the parrot family and makes excellent pet if it is tamed and raised properly.",
        ),
        Parrot(
            1,
            "Wag",
            2.6,
            "Male",
            "Yellow",
            380.0,
            R.drawable.yellow_p,
            "It is huge, beautiful and brightly colored and is known as gentle giant in the parrot world.",
        ),
        Parrot(
            2,
            "Kesha",
            2.2,
            "Male",
            "Green",
            258.0,
            R.drawable.green_p,
            "Amazon parrot is boisterous, playful, outgoing and renowned for talking.",
        ),
        Parrot(
            3,
            "Queen",
            2.1,
            "Female",
            "Pink",
            190.0,
            R.drawable.white_p,
            "It likes to be petted and is satisfied as long as it is near you.",
        ),
        Parrot(
            4,
            "Gosha",
            1.7,
            "Male",
            "Blue",
            265.0,
            R.drawable.blue_p,
            "It loves interacting with their human family members, and is also independent enough to entertain themself with bird toys.",
        )
    )
}
