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
package dev.ytym.popinjay.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import dev.ytym.popinjay.component.ItemParrotCard
import dev.ytym.popinjay.component.TopBar
import dev.ytym.popinjay.ui.theme.model.Parrot

@Composable
fun Home(navController: NavHostController, parrotList: List<Parrot>) {
    LazyColumn {
        item {
            TopBar()
            Spacer(modifier = Modifier.height(8.dp))
        }
        items(parrotList) {
            parrotList.forEach {
                ItemParrotCard(
                    it,
                    onItemClicked = { parrot ->
                        navController.navigate("details/${parrot.id}/${parrot.name}")
                    }
                )
            }
        }
    }
}
