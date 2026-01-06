# class SampleClass:
#     class_attr  = 'This is a class attr'

#     def __init__(self, name:str) -> None:
#         self.__name = name
    
#     def get_name(self):
#         return self.__name
    
# class SampleSubClass(SampleClass):
#     def __init__(self, first_name: str, second_name:str) -> None:
#         super().__init__(first_name)
#         self.__last_name = second_name
    
#     def get_name(self):
#         return f'''
#         firstName:{super().get_name()},
#         lastName: {self.__last_name}
#         '''  


# sample = SampleClass('name')
# print(sample.get_name())
# son = SampleSubClass('mal','com')
# print(son.get_name()) 
test_dic = dict()
for i in range(10):
    test_dic[str(i) + 's'] = i
result = dict(sorted(test_dic.items(),key= lambda x : -x[1]))
print(result)