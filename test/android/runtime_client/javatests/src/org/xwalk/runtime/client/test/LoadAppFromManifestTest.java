// Copyright (c) 2012 The Chromium Authors. All rights reserved.
// Copyright (c) 2013 Intel Corporation. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.xwalk.runtime.client.test;

import android.test.suitebuilder.annotation.SmallTest;
import org.chromium.base.test.util.Feature;
import org.xwalk.runtime.client.shell.XWalkRuntimeClientShellActivity;
import org.xwalk.test.util.RuntimeClientApiTestBase;

/**
 * Test suite for loadAppFromManifest().
 */
public class LoadAppFromManifestTest extends XWalkRuntimeClientTestBase {

    @SmallTest
    @Feature({"LoadAppFromManifest"})
    public void testLoadAppFromManifest() throws Throwable {
        RuntimeClientApiTestBase<XWalkRuntimeClientShellActivity> helper =
                new RuntimeClientApiTestBase<XWalkRuntimeClientShellActivity>(
                        getTestUtil(), this);
        helper.testLoadAppFromManifest();
    }
}
