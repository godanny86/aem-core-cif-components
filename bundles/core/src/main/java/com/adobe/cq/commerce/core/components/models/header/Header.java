/*
 *   Copyright 2019 Adobe Systems Incorporated
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.adobe.cq.commerce.core.components.models.header;

import javax.annotation.Nullable;

import org.apache.sling.api.resource.Resource;

/**
 * Sling Model API for the Header component
 */
public interface Header {

    @Nullable
    String getSearchResultsPageUrl();

    /**
     * @return the URL of the navigation root page
     */
    @Nullable
    String getNavigationRootPageUrl();

    /**
     * @return the {@link Resource} representing the "mincart" component, or <code>null</code> if there is no child resource with the name <code>minicart</code>
     */
    @Nullable
    Resource getMinicartResource();
}
