package com.dnkdream.dnkfile.services;

import com.dnkdream.dnkfile.domains.DnkFile;
import com.dnkdream.dnkfile.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DnkfileService {
    @Autowired
    private FileRepository repository;

    public DnkFile get(String key) {
        Optional<DnkFile> ret = repository.findByKey(key);
        return ret.isPresent() ? ret.get() : null;
    }

    public DnkFile download(String key) {
        Optional<DnkFile> obj = repository.findByKey(key);
        if(obj.isPresent()) {
            DnkFile file = obj.get();
            Integer maxCount = file.getMaxDownloadCount();

            if(maxCount.intValue() > file.getDownloadCount().intValue()) {
                file.setDownloadCount(file.getDownloadCount().intValue() + 1);
                if(file.isAutoDelete()) {
//                    delete :
                }
            }
            repository.save(file);
            return file;
        }
        else {
            return null;
        }
    }
}
