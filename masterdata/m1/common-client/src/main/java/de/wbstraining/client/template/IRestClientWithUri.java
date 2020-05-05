package de.wbstraining.client.template;

import de.wbstraining.common.interfaces.IDto;

public interface IRestClientWithUri<T extends IDto> extends IReadOnlyTemplateWithUri<T> {

    // create

    String createAsUri(final T resource);

}
