/*
 * Copyright 2014-2015. Adaptive.me.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.adaptive.ide;

import com.intellij.openapi.wm.WelcomeScreen;
import com.intellij.openapi.wm.WelcomeScreenProvider;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by panthro on 26/03/15.
 */
public class AdaptiveWelcomeScreenProvider implements WelcomeScreenProvider {

  @Nullable
  @Override
  public WelcomeScreen createWelcomeScreen(JRootPane rootPane) {
    //TODO create the Adaptive home screen
    return null;
  }

  @Override
  public boolean isAvailable() {
    //TODO do we need to show our own welcome all the time?
    return false;
  }
}
