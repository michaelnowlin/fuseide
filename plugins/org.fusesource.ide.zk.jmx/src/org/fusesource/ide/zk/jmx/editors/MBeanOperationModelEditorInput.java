/**
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

package org.fusesource.ide.zk.jmx.editors;

import org.fusesource.ide.zk.jmx.model.MBeanOperationModel;
import org.fusesource.ide.zk.jmx.viewers.MBeanOperationModelElementType;

/**
 * TODO: Comment.
 * 
 * @author Mark Masse
 */
public class MBeanOperationModelEditorInput extends MBeanFeatureModelEditorInput<MBeanOperationModel> {

    public MBeanOperationModelEditorInput(String editorId, MBeanOperationModel model) {
        super(editorId, model, new MBeanOperationModelElementType());
    }

}
