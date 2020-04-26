package com.soebes.itf.jupiter.mrm;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author Karl Heinz Marbaise
 */
class MRMServerTest {

  @Test
  void first() throws Exception {
    File mrmRepository = new File(
        "/Users/khmarbaise/ws-git-codehaus/versions-versions-plugin/src/test/resources-its/org/codehaus/mojo/versions/it/CompareDependenciesIT/.mrm");
    File localM2 = new File("/Users/khmarbaise/.m2/repository");

    RepoContainer repoContainer = new RepoContainer()
        .add(localM2)
        .add(mrmRepository);

    MRMServer mrm = new MRMServer(repoContainer, 20080);

    mrm.create();

//    mrm.start();
//    URI uri = mrm.getURI();
//    System.out.println("url = " + uri);
//    TimeUnit.MINUTES.sleep(10);
//    mrm.shutdown();

  }
}
