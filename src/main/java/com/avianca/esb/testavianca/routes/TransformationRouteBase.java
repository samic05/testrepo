/*
 * Copyright 2005-2016 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.avianca.esb.testavianca.routes;

import org.springframework.stereotype.Component;
import com.avianca.esb.testavianca.configurador.ConfigurationRoute;


@Component
public class TransformationRouteBase extends ConfigurationRoute {

	public void configure() throws Exception {
		super.configure();
		//Here is where you need make all the process in the route.
		from("direct:transformationRouteBase").id("testavianca_transformation")
			.bean("transformationComponent", "transformation")
			.log("{id} - Sending to producer")
			.to("direct:amqProducerRouteBase").end();
	}
}
