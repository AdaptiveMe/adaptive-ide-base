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

import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.AnAction;
import me.adaptive.ide.project.AdaptiveNewProjectAction;

/**
 * Created by panthro on 26/03/15.
 */
public class AdaptiveSpecificInitializer implements Runnable {

  @Override
  public void run() {
    //replaceIdeaWelcomeScreenActions();
  }

  /**
   * Replaces the default actions present on the Welcome Screen of the IDE with Adaptive actions
   */
  private static void replaceIdeaWelcomeScreenActions() {
    // Update the Welcome Screen actions
    ActionManager am = ActionManager.getInstance();

    AdaptiveNewProjectAction welcomeScreenNewProject = new AdaptiveNewProjectAction();
    welcomeScreenNewProject.getTemplatePresentation().setText("Start a new Adaptive Studio project");
    replaceAction("WelcomeScreen.CreateNewProject", welcomeScreenNewProject);

    am.getAction("WelcomeScreen.OpenProject").getTemplatePresentation().setText("Open an existing Adaptive project");
    am.getAction("WelcomeScreen.GetFromVcs").getTemplatePresentation().setText("Check out Adaptive project from Version Control");
  }

  /**
   * Replaces the current action {@code AnAction} for the given actionId
   *
   * @param actionId  the action id that will be replaced
   * @param newAction the new action that will replace the old one for the given id
   */
  private static void replaceAction(String actionId, AnAction newAction) {
    ActionManager am = ActionManager.getInstance();
    AnAction oldAction = am.getAction(actionId);
    if (oldAction != null) {
      newAction.getTemplatePresentation().setIcon(oldAction.getTemplatePresentation().getIcon());
      am.unregisterAction(actionId);
    }
    am.registerAction(actionId, newAction);
  }
}
