/*
* Copyright (c) 2014 Snowplow Analytics Ltd. All rights reserved.
*
* This program is licensed to you under the Apache License Version 2.0, and
* you may not use this file except in compliance with the Apache License
* Version 2.0.  You may obtain a copy of the Apache License Version 2.0 at
* http://www.apache.org/licenses/LICENSE-2.0.
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the Apache License Version 2.0 is distributed on an "AS
* IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
* implied.  See the Apache License Version 2.0 for the specific language
* governing permissions and limitations there under.
*/
package com.snowplowanalytics.iglu.repositories.scalaserver
package util

import com.typesafe.config.ConfigFactory

object Config {
  val config = ConfigFactory.load()

  val interface = config.getString("repo-server.interface")
  val port = config.getInt("repo-server.port")

  val pgHost = config.getString("postgres.host")
  val pgPort = config.getInt("postgres.port")
  val pgDbName = config.getString("postgres.dbname")
  val pgDriver = config.getString("postgres.driver")
}