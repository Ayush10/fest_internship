/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.service;

import com.admin.dto.BookGroupDto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Ayush
 */
@Local
public interface BookGroupService {
    boolean addBookGroup(BookGroupDto bookGroupDto);
    boolean updateBookGroup(BookGroupDto bookGroupDto);
    boolean deleteBookGroup(BookGroupDto bookGroupDto);
    BookGroupDto findBookGroupById(long id);
    List<BookGroupDto> findAllBookGroups();
}
