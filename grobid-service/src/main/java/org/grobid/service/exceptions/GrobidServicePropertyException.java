/**
 * Copyright 2010 INRIA.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.grobid.service.exceptions;


import javax.ws.rs.core.Response;

public class GrobidServicePropertyException extends GrobidServiceException {
    /**
     * The serial.
     */
    private static final long serialVersionUID = -756080338090769910L;

    public GrobidServicePropertyException() {
        super(Response.Status.INTERNAL_SERVER_ERROR);
    }

    public GrobidServicePropertyException(String msg) {
        super(msg, Response.Status.INTERNAL_SERVER_ERROR);
    }

    public GrobidServicePropertyException(String msg, Throwable cause) {
        super(msg, cause, Response.Status.INTERNAL_SERVER_ERROR);
    }
}
