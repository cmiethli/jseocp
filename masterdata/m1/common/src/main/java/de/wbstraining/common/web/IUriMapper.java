package de.wbstraining.common.web;

import de.wbstraining.common.interfaces.IDto;

public interface IUriMapper {

    <T extends IDto> String getUriBase(final Class<T> clazz);
}
