/*
 * Copyright 2017 nosemaj.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.medium.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Image is a simple POJO for representing an image resource on Medium.
 */
public class Image {

    /**
     * The name of the JSON key for the url.
     */
    private static final String JSON_KEY_URL = "url";

    /**
     * The name of the JSON key for the MD5.
     */
    private static final String JSON_KEY_MD5 = "md5";

    /**
     * The URL of the image.
     */
    private String url;

    /**
     * An MD5 hash of the image data.
     */
    private String md5;

    /**
     * Constructs a new Image.
     *
     * @param url the url of the image on Medium
     * @param md5 An MD5 hash of the image data
     */
    @JsonCreator
    private Image(
            @JsonProperty(JSON_KEY_URL) final String url,
            @JsonProperty(JSON_KEY_MD5) final String md5) {

        this.url = url;
        this.md5 = md5;
    }

    /**
     * Gets the image URL.
     *
     * @return the URL of the image
     */
    public String getUrl() {
        return url;
    }

    /**
     * Gets the MD5 hash of the image data.
     *
     * @return the MD5 hash of the image
     */
    public String getMd5() {
        return md5;
    }
}

