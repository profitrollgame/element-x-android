/*
 * Copyright (c) 2023 New Vector Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.element.android.libraries.designsystem.atomic.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.element.android.libraries.designsystem.preview.ElementPreview
import io.element.android.libraries.designsystem.preview.PreviewsDayNight
import io.element.android.compound.theme.ElementTheme

@Composable
fun RedIndicatorAtom(
    modifier: Modifier = Modifier,
    size: Dp = 10.dp,
    borderSize: Dp = 1.dp,
    color: Color = ElementTheme.colors.bgCriticalPrimary,
) {
    Box(
        modifier = modifier
            .size(size)
            .border(borderSize, ElementTheme.materialColors.background, CircleShape)
            .padding(borderSize / 2)
            .clip(CircleShape)
            .background(color)
    )
}

@PreviewsDayNight
@Composable
internal fun RedIndicatorAtomPreview() = ElementPreview {
    RedIndicatorAtom()
}
