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

package me.adaptive.ide.branding;

import com.intellij.ide.IdeBundle;
import com.intellij.ide.ui.LafManager;
import com.intellij.ide.util.PropertiesComponent;
import com.intellij.openapi.fileTypes.FileTypeManager;
import com.intellij.util.messages.MessageBus;
import com.intellij.util.ui.UIUtil;

import javax.swing.*;

/**
 * Created by panthro on 25/03/15.
 */
public class AdaptiveInitialConfigurator {

  public static final String ADAPTIVE_INITIAL_CONFIG_V1 = "Adaptive.InitialConfiguration.V1";


  public AdaptiveInitialConfigurator(MessageBus bus, final PropertiesComponent propertiesComponent, final FileTypeManager fileTypeManager) {
    if (!propertiesComponent.getBoolean(ADAPTIVE_INITIAL_CONFIG_V1, false)) {
      setLafToDarcula();
      propertiesComponent.setValue(ADAPTIVE_INITIAL_CONFIG_V1, "true");
    }
  }

  /**
   * Checks if the current LaF is Darcula and if is not set to it
   */
  public void setLafToDarcula() {
    if (!UIUtil.isUnderDarcula()) {
      LafManager lafManager = LafManager.getInstance();
      for (UIManager.LookAndFeelInfo info : lafManager.getInstalledLookAndFeels()) {
        if (info.getName().equals(IdeBundle.message("idea.dark.look.and.feel"))) {
          lafManager.setCurrentLookAndFeel(info);
          lafManager.updateUI();
          lafManager.repaintUI();
        }
      }
    }
  }
}
